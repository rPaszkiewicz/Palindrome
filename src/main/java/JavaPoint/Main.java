package JavaPoint;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        while (true) {
            System.out.println("Please enter 1. for number and 2. for String and 0 for quit.");
            int choice = reader.nextInt();
            if (choice==0)
                break;
            else if (choice == 1) {
                System.out.println("Number please:");
                int num = reader.nextInt();
                System.out.println(palindromeChecker.isNumberPalindrome(num));
            } else if (choice == 2) {
                System.out.println("Word please:");
                reader.nextLine();
                String word = reader.nextLine();
                System.out.println(palindromeChecker.isStringPalindrome(word));
            } else
                System.out.println("You have to specify 1 or 2");
        }
        reader.close();
        System.out.println("Good bye.");
    }
}
