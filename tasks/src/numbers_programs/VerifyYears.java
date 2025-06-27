package numbers_programs;

import java.util.Scanner;

public class VerifyYears {

    public static void main(String[] args) {
        // to read the data from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter your year to check leap :: ");
        int year = scanner.nextInt();
        System.out.println(year + (checkLeapYear(year) ? " is a leap year" : " is not a leap year"));
    }

    /**
     * @description this method is used to check the given year leap or not.
     * @param year    <code>int</code>
     * @return status <code>boolean</code>
     */
    public static boolean checkLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}
/*
please enter your year to check leap :: 1900
1900 is not a leap year
please enter your year to check leap :: 2024
2024 is a leap year
*/