package com.github.cchacin;

import com.github.cchacin.util.Timeit;
import retrofit.RestAdapter;
import retrofit.http.GET;
import retrofit.http.Path;

import java.util.Base64;
import java.util.List;

public class Sample8 {
  private static final String API_URL = "https://api.github.com";
  public static final String TOKEN = "215f0b45e45a9d5efacfd145e0e47719f6e914d9";
  public static final String OWNER = "cchacin";

  static class Repository {
    String name;
  }
  static class Contributor {
    String login;
    int contributions;
  }

  interface GitHub {
    @GET("/repos/{owner}/{repo}/contributors")
    List<Contributor> contributors(@Path("owner") String owner, @Path("repo") String repo);

    @GET("/users/{owner}/repos")
    List<Repository> repositories(@Path("owner") String owner);
  }

  public static void main(String... args) {
    RestAdapter restAdapter =
        new RestAdapter.Builder().setEndpoint(API_URL).setRequestInterceptor(request -> {
          // create Base64 encodet string
            final String credentials = OWNER + ":" + TOKEN;

            String string = "Basic " + Base64.getEncoder().encodeToString(credentials.getBytes());
            request.addHeader("Accept", "application/json");
            request.addHeader("Authorization", string);
            try {
              Thread.sleep(200);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }).build();

    GitHub github = restAdapter.create(GitHub.class);


//    Timeit.code(() -> {
//      List<Repository> repositories = github.repositories(OWNER);
//      for (Repository repository : repositories) {
//        System.out.println("Repository: " + repository.name);
//        List<Contributor> contributors = github.contributors(OWNER, repository.name);
//        for (Contributor contributor : contributors) {
//          System.out.println("==> contributor" + contributor.login + " ("
//              + contributor.contributions + ")");
//        }
//      }
//    });






















     Timeit.code(() -> github
         .repositories(OWNER)
         .parallelStream()
         .forEach(
             (repository) -> github
                 .contributors(OWNER, repository.name)
                 .parallelStream()
                 .forEach(
                     (contributor) -> System.out.println(contributor.login + " ("
                         + contributor.contributions + ")"))));
  }
}
