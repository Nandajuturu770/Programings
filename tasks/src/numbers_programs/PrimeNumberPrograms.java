package numbers_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumberPrograms {

    public static void main(String[] args) {
        // to read the input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter your number :: ");
        int number = scanner.nextInt();
        System.out.print("please enter initial value :: ");
        int initialValue = scanner.nextInt();
        System.out.print("please enter final value :: ");
        int finalValue = scanner.nextInt();
        checkPrimeNumber(number);
        ArrayList<Integer> primeNumbers = getPrimeNumbersBetweenRange(initialValue, finalValue);
        for (Integer prime : primeNumbers) {
            System.out.println(prime);
        }
    }

    /**
     * @description this method is used to verify the given number is prime.
     * @param number <code>int</code>
     */
    public static void checkPrimeNumber(int number) {
        // to check the prime number
        if (checkPrime(number)) {
            System.out.println("the number ' " + number + " ' is prime number");
        } else {
            System.out.println("the number ' " + number + " ' is not prime number");
        }
    }

    /**
     * @description this method is used to get all prime numbers between given
     * range.
     * @param initialValue   <code>int</code>
     * @param finalValue     <code>int</code>
     * @return primesNumbers <code>ArrayList</code>
     */
    public static ArrayList<Integer> getPrimeNumbersBetweenRange(int initialValue, int finalValue) {
        // to store all the prime numbers
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = initialValue; i <= finalValue; i++) {
            if (checkPrime(i)) {
                primes.add(i);
                System.out.print(i);
                if (i < finalValue) {
                    System.out.print(" ,");
                }
            }
        }
        return primes;
    }

    /**
     * @description this method is used to verify the given number is prime.
     * @param number  <code>int</code>
     * @return status <code>boolean</boolean> if number is prime return true
     * otherwise false
     */
    public static boolean checkPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % 2 == 0) {
                return false;
            }
        }
        return number > 1;
    }
}
