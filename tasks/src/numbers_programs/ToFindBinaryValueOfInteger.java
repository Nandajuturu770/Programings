package numbers_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class ToFindBinaryValueOfInteger {

    public static void main(String[] args) {
        // to read input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your number to find the binary value :: ");
        int number = scanner.nextInt();
        getBinaryValueOfInteger(number);

    }

    /**
     * @description this method is used to get the binary value of integer
     * @param number <code>int</code>
     */
    public static void getBinaryValueOfInteger(int number) {
        ArrayList<Integer> binary = new ArrayList<>();
        for (int i = number; i > 0; i /= 2) {
            int reminder = i % 2;
            binary.add(reminder);
        }
        for (int i = binary.size() - 1; i >= 0; i--) {
            System.out.print(binary.get(i));
        }
    }

}
