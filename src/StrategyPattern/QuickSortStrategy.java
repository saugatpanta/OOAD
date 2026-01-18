package StrategyPattern;

import java.util.Arrays;

public class QuickSortStrategy implements SortingStrategy {

  @Override
  public void sort(int[] array) {
    if (array == null || array.length <= 1) {
      System.out.println("Quick Sort");
      System.out.println(Arrays.toString(array));
      return;
    }

    quickSort(array, 0, array.length - 1);

    System.out.println("Quick Sort");
    System.out.println(Arrays.toString(array)); // print sorted array
  }

  private void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int pivotIndex = partition(arr, low, high);

      quickSort(arr, low, pivotIndex - 1);
      quickSort(arr, pivotIndex + 1, high);
    }
  }

  private int partition(int[] arr, int low, int high) {
    int pivot = arr[high]; // last element as pivot
    int i = low - 1;

    for (int j = low; j < high; j++) {
      if (arr[j] <= pivot) {
        i++;
        swap(arr, i, j);
      }
    }

    swap(arr, i + 1, high);
    return i + 1;
  }

  private void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
