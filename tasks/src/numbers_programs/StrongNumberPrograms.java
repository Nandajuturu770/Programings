package numbers_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class StrongNumberPrograms {

    public static void main(String[] args) {
        // to read the data from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter your number :: ");
        int number = scanner.nextInt();
        System.out.println(checkStrongNumber(number));
        System.out.print("please enter initial value :: ");
        int initialValue = scanner.nextInt();
        System.out.print("please enter final value :: ");
        int finalValue = scanner.nextInt();
        System.out.println(getAllStrongNumbersBetweenRange(initialValue, finalValue));
    }

    /**
     * @description this method is used to verify the number strong number.
     * @param number  <code>int</code>
     * @return status <code>boolean</code>
     */
    public static boolean checkStrongNumber(int number) {
        int sum = 0;
        for (int i = number; i > 0; i /= 10) {
            int reminder = i % 10;
            int factorial = 1;
            for (int j = reminder; j >= 1; j--) {
                factorial *= j;
            }
            sum += factorial;
        }
        return number == sum;
    }

    /**
     * @description this method is used to get all strong between the range.
     * @param initialValue   <code>boolean</code>
     * @param finalValue     <code>boolean</code>
     * @return strongNumbers <code>ArrayList</code>
     */
    public static ArrayList<Integer> getAllStrongNumbersBetweenRange(int initialValue, int finalValue) {
        // to store the all strong numbers
        ArrayList<Integer> strongNumbers = new ArrayList<>();
        for (int i = initialValue; i <= finalValue; i++) {
            if (checkStrongNumber(i)) {
                strongNumbers.add(i);
                System.out.print(i + ", ");
            }
        }
        return strongNumbers;
    }
}
