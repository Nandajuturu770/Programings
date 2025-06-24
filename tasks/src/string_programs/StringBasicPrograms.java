package string_programs;

import java.util.Scanner;

public class StringBasicPrograms {

    public static void main(String[] args) {
        // to read the data from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter your string ::");
        String word = scanner.nextLine();
        System.out.println("reverse of the given '" + word + "' is :: " + reverseString(word));
        System.out.println("the given word '" + word + "' is palindrome :: " + checkPalindromeString(word));
        System.out.println("the length of string is :: " + findLengthOfString(word));
        System.out.println("after removing space from givem '" + word + "' is :: " + removeSpacesBetweenWords(word));
    }

    /**
     * @description this method is used to reverse the string.
     * @param word           <code>String</code>
     * @return reverseString <code>String</code>
     */
    public static String reverseString(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            stringBuilder.append(word.charAt(i));
        }
        return stringBuilder.toString();
    }

    /**
     * @description this method is used to check the palindrome string.
     * @param string  <code>String</code>
     * @return status <code>boolean</code>
     */
    public static boolean checkPalindromeString(String string) {
        int lastIndex = string.length() - 1;
        for (int i = 0; i <= (string.length() - 1) / 2; i++) {
            if (string.charAt(i) != string.charAt(lastIndex--)) {
                return false;
            }
        }
        return true;
    }

    /**
     * @description this method is used to find the length of string with length
     * method.
     * @param string  <code>String</code>
     * @return length <code>int</code>
     */
    public static int findLengthOfString(String string) {
        return string.toCharArray().length;
    }

    /**
     * @description this method is used to remove spaces from the string.
     * @param string              <code>String</code>
     * @return spaceRemovedString <code>String</code>
     */
    public static String removeSpacesBetweenWords(String string) {
        String[] wordsArray = string.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < wordsArray.length; i++) {
            stringBuilder.append(wordsArray[i]);
        }
        return stringBuilder.toString();
    }
}
/*
please enter your string ::changes never happen until you change.
reverse of the given 'changes never happen until you change.' is :: .egnahc uoy litnu neppah reven segnahc
the given word 'changes never happen until you change.' is palindrome :: false
the length of string is :: 39
after removing space from givem 'changes never happen until you change.' is :: changesneverhappenuntilyouchange.
*/
