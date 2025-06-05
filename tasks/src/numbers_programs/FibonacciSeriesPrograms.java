package numbers_programs;

import java.util.Scanner;

public class FibonacciSeriesPrograms {

    public static void main(String[] args) {
        // to read the data from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter initial value :: ");
        int initialValue = scanner.nextInt();
        System.out.print("please enter second value :: ");
        int secondValue = scanner.nextInt();
        System.out.print("please enter number of digits do you want :: ");
        int noOfDigits = scanner.nextInt();
        fibonacciSeries(initialValue, secondValue, noOfDigits);
        System.out.println("\nfibonacci by using recursion ::");
        fibonacciSeriesUsingRecursion(initialValue, secondValue, noOfDigits);
    }

    /**
     * @description this method is used to print all fibonacci series number
     * till the given number of digits
     * @param initialValue <code>int</code>
     * @param secondValue  <code>int</code>
     * @param noOfDigits   <code>int</code>
     */
    public static void fibonacciSeries(int initialValue, int secondValue, int noOfDigits) {
        for (int i = 0; i < noOfDigits; i++) {
            System.out.print(initialValue);
            int sum = initialValue + secondValue;
            initialValue = secondValue;
            secondValue = sum;
            if (i < noOfDigits - 1) {
                System.out.print(", ");
            }
        }
    }

    /**
     * @description this method is used to print fibonacci series using
     * recursion.
     * @param initial     <code>int</code>
     * @param secondValue <code>int</code>
     * @param noOfDigits  <code>int</code>
     */
    public static void fibonacciSeriesUsingRecursion(int initialValue, int secondValue, int noOfDigits) {
        if (noOfDigits <= 0) {
            return;
        }
        System.out.print(initialValue);
        if (noOfDigits > 1) {
            System.out.print(", ");
        }
        int sum = initialValue + secondValue;
        initialValue = secondValue;
        secondValue = sum;
        fibonacciSeriesUsingRecursion(initialValue, secondValue, --noOfDigits);
    }
}
/*

please enter initial value :: 0
please enter second value :: 1
please enter number of digits do you want :: 10
0, 1, 1, 2, 3, 5, 8, 13, 21, 34
fibonacci by using recursion ::
0, 1, 1, 2, 3, 5, 8, 13, 21, 34

*/