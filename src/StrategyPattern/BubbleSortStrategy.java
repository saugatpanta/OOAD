package StrategyPattern;

import java.util.Arrays;

public class BubbleSortStrategy implements SortingStrategy {

  @Override
  public void sort(int[] array) {
    if (array == null || array.length <= 1) {
      System.out.println("Bubble Sort");
      System.out.println(Arrays.toString(array));
      return;
    }

    int n = array.length;
    boolean swapped;

    for (int i = 0; i < n - 1; i++) {
      swapped = false;

      for (int j = 0; j < n - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          swapped = true;
        }
      }

      // Optimization: stop if already sorted
      if (!swapped) {
        break;
      }
    }

    System.out.println("Bubble Sort");
    System.out.println(Arrays.toString(array)); // print sorted array
  }
}
