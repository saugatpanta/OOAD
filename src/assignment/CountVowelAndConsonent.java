package assignment;

import java.util.Scanner;

//3. Write a program to count vowels and consonants in a string. Create a method
//counter(String) that will return count of vowels and consonants.
public class CountVowelAndConsonent {
    public static int[] counter(String str){
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }else{
                consonants++;
            }
        }
        return new int[] {vowels, consonants};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        int[] result = counter(input);

        System.out.println("Vowels: "+result[0]);
        System.out.println("Consonants: "+result[1]);
    }
}
