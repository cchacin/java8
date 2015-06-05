package com.github.cchacin;

import java.util.Arrays;
import java.util.List;

public class Sample1 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    // External iteration
    for (int i = 0; i < numbers.size(); i++) {
      System.out.println(i);
    }
  }
}
