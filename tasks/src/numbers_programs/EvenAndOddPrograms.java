package numbers_programs;

import java.util.Scanner;

public class EvenAndOddPrograms {

    public static void main(String[] args) {
        // to reade the data from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter number to check even :: ");
        int number1 = scanner.nextInt();
        System.out.println(number1+" "+checkEvenNumber(number1));
        System.out.print("please enter number to check odd :: ");
        int number2 = scanner.nextInt();
        System.out.println(number2+" "+checkOddNumber(number2));
        System.out.print("please enter initial value to add all even and odd numbers in range :: ");
        int initialValue = scanner.nextInt();
        System.out.print("please enter final value to add all even and odd numbers in range :: ");
        int finalValue = scanner.nextInt();
        System.out.println("Sum is :: "+summationOfEvenAndOdd(initialValue, finalValue));
    }

    /**
     * @description this method is used to check the given number is even.
     * @param number  <code>int</code>
     * @return result <code>boolean</code> if number is even then true other wise false.
     */
    public static boolean checkEvenNumber(int number) {
       return number%2==0 && number>0;
    }

    /**
     * @description this method is used to check the given number is odd.
     * @param number  <code>int</code>
     * @return result <code>boolean</code> if number is odd then true other wise false.
     */
    public static boolean checkOddNumber(int number) {
        return number%2==1 && number>0;
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
            if(checkEvenNumber(i)){
                evenSum += i;
            }else{
                oddSum += i;
            }
        }
        System.out.println("sum of all even number in range is :: "+evenSum);
        System.out.println("sum of all odd number in range is :: "+oddSum);
        return evenSum + oddSum;
    }
}
/*

please enter number to check even :: 2
2 true
please enter number to check odd :: 8
8 false
please enter initial value to add all even and odd numbers in range :: 1
please enter final value to add all even and odd numbers in range :: 5
sum of all even number in range is :: 6
sum of all odd number in range is :: 9
Sum is :: 15

 */