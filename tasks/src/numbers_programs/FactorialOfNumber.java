package numbers_programs;

import java.util.Scanner;

public class FactorialOfNumber {

    public static void main(String[] args) {
        // to reade the data from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter number to find the factorial :: ");
        int number = scanner.nextInt();
        System.out.println("the factorial for the given " + number + " is :: " + getFactorialByUsingRecursion(number));
    }

    /**
     * @description this method is used to get the factorial of the given
     * number.
     * @param number     <code>int</code>
     * @return factorial <code>int</code>
     */
    public static int getFactorial(int number) {
        int factorial = 1;
        for (int i = number; i > 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * @description this method is used to get the factorial of the given number
     * by using recursion.
     * @param number     <code>int</code>
     * @return factorial <code>int</code>
     */
    public static int getFactorialByUsingRecursion(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * getFactorialByUsingRecursion(number - 1);
    }
}
/*
 please enter number to find the factorial :: 5
 the factorial for the given 5 is :: 120
 */
