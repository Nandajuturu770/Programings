package string_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatedCharacters {

    public static Scanner scanner;

    public static void main(String[] args) {
        // to get user from the user
        scanner = new Scanner(System.in);
        System.out.print("please enter your word to find the repeated characters :: ");
        String string = scanner.next();
        System.out.println("repeated characters of given '" + string + "' is :: " + repeatedCharacters(string));
    }

    /**
     * @description this method is used to find the repeated characters of
     * string.
     * @param string              <code>String</code>
     * @return repeatedCharacters <code>List</code>
     */
    public static List repeatedCharacters(String string) {
        boolean[] falseArray = new boolean[string.length()];
        List<Character> charList = new ArrayList<>();
        for (int i = 0; i < falseArray.length; i++) {
            char character = string.charAt(i);
            if (!falseArray[i]) {
                for (int j = i + 1; j < falseArray.length; j++) {
                    if (character == string.charAt(j)) {
                        if (!charList.contains(character)) {
                            charList.add(character);
                            falseArray[i] = true;
                        }
                    }
                }
            }
        }
        return charList;
    }
}
/*
please enter your word to find the repeated characters :: aabbaaccddeefffgghhii
repeated characters of given 'aabbaaccddeefffgghhii' is :: [a, b, c, d, e, f, g, h, i]
*/