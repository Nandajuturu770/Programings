package numbers_programs;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        // reading data from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter your number to check palindrome :: ");
        int number = scanner.nextInt();
        System.out.println("the given '" + number + "' is palindrome :: " + checkPalindrome(number));
    }

    /**
     * @description this method is used to check the given number is palindrome.
     * @param number  <code>int</code>
     * @return result <code>boolean</code>
     */
    public static boolean checkPalindrome(int number) {
        int reverseNumber = 0;
        for (int i = number; i > 0; i /= 10) {
            reverseNumber = reverseNumber * 10 + i % 10;
        }
        return number == reverseNumber;
    }
}

/*
please enter your number to check palindrome :: 12321
the given '12321' is palindrome :: true
please enter your number to check palindrome :: 12345 
the given '12345' is palindrome :: false
*/