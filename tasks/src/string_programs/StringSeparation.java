package string_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringSeparation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your word :: ");
        String word = scanner.nextLine();
        wordSeparation(word);
        wordSeparationByType(word);
    }

    /**
     * This method is used to find the word separation based on their type.
     * @param word <code>{@link String}</code>
     */
    public static void wordSeparation(String word){

        for (char ch : word.toCharArray()){
            if (ch >= 'A' && ch <= 'Z'){
                System.out.println(ch + "- Upper Case");
            }else if(ch >= 'a' && ch <= 'z'){
                System.out.println(ch + "- Lower Case");
            }else if(ch >='0' && ch <= '9'){
                System.out.println(ch + "- Number");
            }else {
                System.out.println(ch + "- Special Character");
            }
        }

    }

    /**
     * This method is used to find the word separation based on their type.
     * @param word <code>{@link String}</code>
     */
    public static void wordSeparationByType(String word){

        List<Character> upperCase = new ArrayList<>();
        List<Character> lowerCase = new ArrayList<>();
        List<Character> numberCase = new ArrayList<>();
        List<Character> specialCase = new ArrayList<>();

        for (char ch : word.toCharArray()){
            if (ch >= 'A' && ch <= 'Z'){
                upperCase.add(ch);
            }else if(ch >= 'a' && ch <= 'z'){
                lowerCase.add(ch);
            }else if(ch >='0' && ch <= '9'){
                numberCase.add(ch);
            }else {
                specialCase.add(ch);
            }
        }

        System.out.println("Upper Case Characters - " + upperCase);
        System.out.println("Lower Case Characters - " +lowerCase);
        System.out.println("Number Case Characters - " +numberCase);
        System.out.println("Special Case Characters - " +specialCase);

    }
}
