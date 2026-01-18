package StrategyPattern;

public class Main {
  public static void main(String[] args){
    SortingContext sc = new SortingContext(new MergeSortStrategy());
    int[] array = {5, 1, 4, 2, 8};
    sc.performSort(array);

    sc.setSortingStrategy(new BubbleSortStrategy());
    sc.performSort(array);

    sc.setSortingStrategy(new QuickSortStrategy());
    sc.performSort(array);
  }
}
