package assignment;
//1. Write a program to swap two numbers using a temporary variable. No need to create
//any additional methods and classes
public class SwapNumber {
    public static void main(String[] args) {
        int num1 = 10, num2 = 50;
        System.out.println("Before swap:");
        System.out.println("Num1: " +  num1 + " Num2: " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swap:");
        System.out.println("Num1: " + num1 + " Num2: " + num2);
    }
}
