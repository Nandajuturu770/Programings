package numbers_programs;

import java.util.Scanner;

public class BasicPrograms {

    public static void main(String[] args) {
        // to reade the data from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter number to check even :: ");
        int number1 = scanner.nextInt();
        System.out.println(number1 + " " + checkEvenNumber(number1));
        System.out.print("please enter number to check odd :: ");
        int number2 = scanner.nextInt();
        System.out.println(number2 + " " + checkOddNumber(number2));
        System.out.print("please enter initial value to add all even and odd numbers in range :: ");
        int initialValue = scanner.nextInt();
        System.out.print("please enter final value to add all even and odd numbers in range :: ");
        int finalValue = scanner.nextInt();
        System.out.println("Sum is :: " + summationOfEvenAndOdd(initialValue, finalValue));
        System.out.println("natural numbers :: ");
        printNumbersWithRecursion(initialValue, finalValue);
        System.out.print("\neven Numbers :: ");
        getEvenNumberInRange(initialValue, finalValue);
        System.out.print("\nodd numbers :: ");
        getOddNumbersInRange(initialValue, finalValue);
    }

    /**
     * @description this method is used to check the given number is even.
     * @param number  <code>int</code>
     * @return result <code>boolean</code> if number is even then true other
     * wise false.
     */
    public static boolean checkEvenNumber(int number) {
        return number % 2 == 0 && number > 0;
    }

    /**
     * @description this method is used to check the given number is odd.
     * @param number  <code>int</code>
     * @return result <code>boolean</code> if number is odd then true other wise
     * false.
     */
    public static boolean checkOddNumber(int number) {
        return number % 2 == 1 && number > 0;
    }

    /**
     * @description this method is used to add all even and odd number in range.
     * @param initialValue <code>int</code>
     * @param finalValue   <code>int</code>
     * @return totalSum    <code>int</code>
     */
    public static int summationOfEvenAndOdd(int initialValue, int finalValue) {
        int evenSum = 0, oddSum = 0;
        for (int i = initialValue; i <= finalValue; i++) {
            if (checkEvenNumber(i)) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println("sum of all even number in range is :: " + evenSum);
        System.out.println("sum of all odd number in range is :: " + oddSum);
        return evenSum + oddSum;
    }

    /**
     * @description this method is used to print the natural number between
     * range.
     * @param initialValue <code>int</code>
     * @param finalValue   <code>int</code>
     */
    public static void printNumbersWithRecursion(int initialValue, int finalValue) {
        if (initialValue > finalValue) {
            return;
        }
        System.out.print(initialValue++ + ", ");
        printNumbersWithRecursion(initialValue, finalValue);
    }

    /**
     * @description this method is used to print the even number between range.
     * @param initialValue <code>int</code>
     * @param finalValue   <code>int</code>
     */
    public static void getEvenNumberInRange(int initialValue, int finalValue) {
        for (int i = initialValue; i <= finalValue; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    /**
     * @description this method is used to print the odd number between range.
     * @param initialValue <code>int</code>
     * @param finalValue   <code>int</code>
     */
    public static void getOddNumbersInRange(int initialValue, int finalValue) {
        for (int i = initialValue; i <= finalValue; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
/*

please enter number to check even :: 8
8 true
please enter number to check odd :: 3
3 true
please enter initial value to add all even and odd numbers in range :: 1
please enter final value to add all even and odd numbers in range :: 20
sum of all even number in range is :: 110
sum of all odd number in range is :: 100
Sum is :: 210
natural numbers ::
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
even Numbers :: 2, 4, 6, 8, 10, 12, 14, 16, 18, 20,
odd numbers :: 1, 3, 5, 7, 9, 11, 13, 15, 17, 19,

 */
