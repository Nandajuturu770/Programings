package numbers_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectNumberPrograms {

    public static void main(String[] args) {
        // to read the data from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter your number to check prefect number or not :: ");
        int number = scanner.nextInt();
        System.out.print("please enter your initial value :: ");
        int initialValue = scanner.nextInt();
        System.out.print("please enter final value for get all perfect numbers :: ");
        int finalValue = scanner.nextInt();
        System.out.println(checkPerfectNumber(number));
        System.out.println(getAllPerfectNumbersInRange(initialValue, finalValue));
    }

    /**
     * @description this method is used to check the given number is perfect or
     * not.
     * @param number  <code>int</code>
     * @return result <code>boolean</code> if number is perfect true otherwise
     * false.
     */
    public static boolean checkPerfectNumber(int number) {
        int sum = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return number == sum;
    }

    /**
     * @description this method is used to get all perfect numbers in range
     * @param initialValue    <code>int</code>
     * @param finalValue      <code>int</code>
     * @return perfectNumbers <code>List</code>
     */
    public static List<Integer> getAllPerfectNumbersInRange(int initialValue, int finalValue) {
        // to store all the perfect numbers
        List<Integer> perfectNumbers = new ArrayList<>();
        for (int i = initialValue; i <= finalValue; i++) {
            if (checkPerfectNumber(i)) {
                perfectNumbers.add(i);
            }
        }
        return perfectNumbers;
    }
}
/*

please enter your number to check prefect number or not :: 496
please enter your initial value :: 1
please enter final value for get all perfect numbers :: 10000
true
[1, 6, 28, 496, 8128]

*/