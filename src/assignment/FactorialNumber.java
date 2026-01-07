package assignment;
import java.util.Scanner;
//2. Write a program to find the factorial of a number. Create a method calcFactorial(int) that
//will return factorial of a number.;


public class FactorialNumber {
    public static int calcFactorial(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("The factorial of " + num +" is : " + calcFactorial(num));

    }
}
