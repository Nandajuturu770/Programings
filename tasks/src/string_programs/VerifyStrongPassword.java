package string_programs;

import java.util.Scanner;

public class VerifyStrongPassword {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your pwd to check the Strong or not ");
        String password = scanner.next();
        boolean b = toCheck(password);
        if (b == true) {
            System.out.println("your pwd is strong");
        } else {
            System.out.println("your pwd is not strong");
        }
    }

    public static boolean toCheck(String s) {
        boolean cap = false;
        String name = "";
        boolean sma = false;
        String number = "";
        boolean num = false;
        String specialchar = "";
        boolean spe = false;
        if (s.length() >= 8) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= 'A' && c <= 'Z') {
                    name += c;
                    cap = true;
                } else if (c >= 'a' && c <= 'z') {
                    name += c;
                    sma = true;
                } else if (c >= '0' && c <= '9') {
                    number += c;
                    num = true;
                } else {
                    specialchar += c;
                    spe = true;
                }
            }
        } else {
            return false;
        }
        System.out.println(name);
        System.out.println(number);
        System.out.println(specialchar);
        if (cap == sma) {
            if (num == spe) {
                return true;
            }
        }
        return false;
    }
}
