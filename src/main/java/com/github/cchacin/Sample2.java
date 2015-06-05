package com.github.cchacin;

import java.util.Arrays;
import java.util.List;

public class Sample2 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    // Removing mutability
    int totalOfValuesDoubled = 0;
    for (int number : numbers) {
      totalOfValuesDoubled += number * 2;
    }
  }
}
