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
        System.out.print("please enter char to find occurrence of it in string :: ");
        char character = scanner.next().charAt(0);
        System.out.println("repeated characters of given '" + string + "' is :: " + repeatedCharacters(string));
        System.out.println("occurrence of the '"+character+"' is :: "+findOccurrenceOfCharacter(string, character)+" in '"+string+"'");
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

    /**
     * @description this method is used to find the occurrence of character in
     * string.
     * @param string      <code>String</code>
     * @param character   <code>char</code>
     * @return occurrence <code>int</code>
     */
    public static int findOccurrenceOfCharacter(String string, char character) {
        int occurrence = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                occurrence++;
            }
        }
        return occurrence;
    }
}
/*
please enter your word to find the repeated characters ::  aabbaaccddeefffgghhii
please enter char to find occurrence of it in string :: f
repeated characters of given 'aabbaaccddeefffgghhii' is :: [a, b, c, d, e, f, g, h, i]
occurrence of the 'f' is :: 3 in 'aabbaaccddeefffgghhii'
*/
