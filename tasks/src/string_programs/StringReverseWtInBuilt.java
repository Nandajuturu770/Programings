package string_programs;

import java.util.Scanner;

public class StringReverseWtInBuilt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your word to reverse :: ");
        String string = scanner.next();
        System.out.println(reverseStringWithoutBuilt(string));
    }

    /**
     * This method is used to reverse the given string.
     * @param string <code>{@link String}</code>
     * @return reverseString <code>String</code>
     */
    public static String reverseStringWithoutBuilt(String string){
        string = string.trim();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = string.length()-1; i >= 0 ; i--) {
            stringBuilder.append(string.charAt(i));
        }
        return  stringBuilder.toString();
    }
}
