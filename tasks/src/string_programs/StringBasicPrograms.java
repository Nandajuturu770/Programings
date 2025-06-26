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
        System.out.println("total number of words in given '" + word + "' is :: " + findNumberOfWordInString(word));
        System.out.println("total number of digits in given '" + word + "' is :: " + findNumberOfDigitsInString(word));
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

    /**
     * @description this method is used to find the number words in the string.
     * @param string     <code>String</code>
     * @return noOfWords <code>int</code>
     */
    public static int findNumberOfWordInString(String string) {
        return string.split(" ").length;
    }

    /**
     * @description this method is used to find the number of digits in string.
     * @param string      <code>string</code>
     * @return noOfDigits <code>int</code>
     */
    public static int findNumberOfDigitsInString(String string) {
        int noOfDigits = 0;
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            if (character >= '0' && character <= '9') {
                noOfDigits++;
            }
        }
        return noOfDigits;
    }
}
/*
please enter your string :: 1changes  0never hap3pen un9til you change 765.
reverse of the given ' 1changes  0never hap3pen un9til you change 765.' is :: .567 egnahc uoy lit9nu nep3pah reven0  segnahc1
the given word ' 1changes  0never hap3pen un9til you change 765.' is palindrome :: false
the length of string is :: 48
after removing space from givem ' 1changes  0never hap3pen un9til you change 765.' is :: 1changes0neverhap3penun9tilyouchange765.
total number of words in given ' 1changes  0never hap3pen un9til you change 765.' is :: 9
total number of digits in given ' 1changes  0never hap3pen un9til you change 765.' is :: 7
 */
