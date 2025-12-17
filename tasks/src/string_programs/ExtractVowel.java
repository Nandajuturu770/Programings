package string_programs;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ExtractVowel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter our string :: ");
        String string = scanner.next();
        System.out.println(extractVowelFromString(string));
    }

    /**
     * @description this method is used to extract vowel from word.
     * @param word string <code>int</code>
     */
    public static Set<Character> extractVowelFromString(String word) {
        Set<Character> extractLatter = new TreeSet<>();
        String upperWord = toUpperCase(word);
        char[] charArray = new char[]{'A', 'E', 'I', 'O', 'U'};
        for (int i = 0; i < word.length(); i++) {
            char latter = upperWord.charAt(i);
            for (int j = 0; j < charArray.length; j++) {
                if (latter == charArray[j]) {
                    extractLatter.add(latter);
                }
            }
        }
        return extractLatter;
    }

    /**
     * @description this method is used to change to upper case.
     * @param word           <code>int</code
     * @return upperCaseWord <code>int</code>
     */
    public static String toUpperCase(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char latter = word.charAt(i);
            if (latter >= 'a' && latter <= 'z') {
                latter = (char) ((int) latter - 32);
            }
            stringBuilder.append(latter);
        }
        return stringBuilder.toString();
    }
}
/*
please enter our string :: nandakiranYou
[A, I, O, U]
*/