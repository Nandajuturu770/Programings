package numbers_programs;

import java.util.Scanner;

public class SumPrograms {

    public static void main(String[] args) {
        // to read the data from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter the number to find the sum of it's digits :: ");
        int number = scanner.nextInt();
        System.out.print("digit place :: ");
        int digitPosition = scanner.nextInt();
        System.out.print("please enter the initial value to find the sum :: ");
        int initialValue = scanner.nextInt();
        System.out.print("please enter the final value to find the sum :: ");
        int finalValue = scanner.nextInt();
        System.out.println("sum of digits of the given " + number + " number is :: " + sumOfDigitsOfNumber(number));
        System.out.println("required number is :: "+getPlacesValueDigits(number, digitPosition));
        System.out.println("sum of the natural numbers :: "+sumOfNaturalNumbers(initialValue, finalValue));
    }

    /**
     * @description this method is used to get the sum of the digits for given
     * number
     * @param number       <code>int</code>
     * @return sumOfDigits <code>int</code>
     */
    public static int sumOfDigitsOfNumber(int number) {
        int sum = 0;
        for (int i = number; i > 0; i /= 10) {
            // to get last digit
            int lastDigit = i % 10;
            sum += lastDigit;
        }
        return sum;
    }

    /**
     * @description this method is used to get place value of the digit
     * @param placeNumber  <code>int</code>
     * @return digitValue  <code>int</code?
     */
    public static int getPlacesValueDigits(int number, int placeNumber) {
        int result = 0;
        if (placeNumber > 0 && number > 0) {
            int tempValue = number;
            for (int i = 1; i <= placeNumber; i++) {
                int remind = tempValue % 10;
                result += power(remind, i - 1);
                tempValue /= 10;
            }
        }
        return result;
    }

    /**
     * @description this method is used to get power of the zeros
     * @param number      <code>int</code>
     * @param powerOfTens <code>int</code>
     * @return result     <code>int</code>
     */
    public static int power(int number, int powerOfTens) {
        int tens = 1;
        for (int i = 1; i <= powerOfTens; i++) {
            tens *= 10;
        }
        return tens * number;
    }

    /**
     * @description this method is used to get sum of the natural numbers.
     * @param initialValue  <code>int</code>
     * @param finalValue    <code>int</code>
     * @return sumOfNumbers <code>int</code>
     */
    public static int sumOfNaturalNumbers(int initialValue, int finalValue){
        int sum = 0;
        for (int i = initialValue; i <= finalValue; i++) {
            sum += i;
        }
        return sum;

    }
}
/*

please enter the number to find the sum of it's digits :: 35464
digit place :: 4
please enter the initial value to find the sum :: 1
please enter the final value to find the sum :: 10
sum of digits of the given 35464 number is :: 22
required number is :: 5464
sum of the natural numbers :: 55

 */
