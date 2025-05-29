package string_programs;

import java.util.Scanner;

public class StringPattern3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your word");
        String wd = scanner.next();
        int c = 0;
        for (int i = 0; i < wd.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (c < wd.length()) {
                    System.out.print(wd.charAt(c));
                    c++;
                } else {
                    return;
                }
            }
            System.out.println();
        }
    }
}
/*
 enter your word : nandakiran

n
an
dak
iran

 */