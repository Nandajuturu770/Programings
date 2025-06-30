package string_programs;

import java.util.Scanner;

public class AnagramStrings {

    public static void main(String[] args) {
        // to read the data from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter first string :: ");
        String string1 = scanner.nextLine();
        System.out.print("please enter second string :: ");
        String string2 = scanner.nextLine();
        System.out.print("the given '" + string1 + ", and '" + string1 + "' are anagrams :: " + checkAnagrams(string1, string2));
    }

    /**
     * @description this method is used to find the given strings are anagrams
     * or not.
     * @param string1 <code>String</code>
     * @param string2 <code>String</code>
     * @return status <code>boolean</code>
     */
    public static boolean checkAnagrams(String string1, String string2) {
        if (string1.length() == string1.length()) {
            return ascendingOrder(string1.toLowerCase()).equals(ascendingOrder(string2.toLowerCase()));
        }
        return false;
    }

    /**
     * @description this method is used to give ascending order of string.
     * @param string           <code>String</code>
     * @return ascendingString <code>String</code>
     */
    public static String ascendingOrder(String string) {
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 1; j < charArray.length; j++) {
                if (charArray[i] > charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        return new String(charArray);
    }
}
/*
please enter first string :: Heart
please enter second string :: Earth
the given 'Heart, and 'Heart' are anagrams :: true
*/