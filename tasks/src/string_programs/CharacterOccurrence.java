package string_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CharacterOccurrence {

    public static void main(String[] args) {
        // reading input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your word :: ");
        String word = scanner.next();
        System.out.println(occurrence(word));
        System.out.println(duplicateOccurrence(word));
        System.out.println(new TreeMap<Character,Integer>(duplicateOccurrence(word)));
    }

    /**
     * This method is used to find the occurrence of the given string.
     * @param word <code>{@link String}</code>
     * @return occurrence <cod>{@link Map}</cod>
     */
    public static Map<Character,Integer> occurrence(String word){
        Map<Character, Integer> occur = new HashMap<>();
        word = word.trim();
        for (int i = 0; i < word.length(); i++) {
           char letter = word.charAt(i);
           if(occur.containsKey(letter)){
               occur.put(letter, occur.get(letter)+1);
           }else {
               occur.put(letter, 1);
           }
        }
        return occur;
    }

    /**
     * This method is used to find the duplicate occurrence of the give string.
     * @param string <code>{@link String}</code>
     * @return charOccurrence <code>{@link Map}</code>
     */
    public static Map<Character,Integer> duplicateOccurrence(String string){
        Map<Character, Integer> charOccurrence = new HashMap<>();
        string = string.trim();
        // fining all occurrence of the characters
        for (char ch : string.toCharArray()){
            if (charOccurrence.containsKey(ch))
                charOccurrence.put(ch , charOccurrence.get(ch)+1);
            else
                charOccurrence.put(ch, 1);
        }
        // finding the only duplicate characters
        Map<Character,Integer> duplicateChar = new HashMap<>();
        for ( Map.Entry<Character, Integer> entry : charOccurrence.entrySet()){
            if(entry.getValue()>1)
                duplicateChar.put(entry.getKey(),entry.getValue());
        }
        return duplicateChar;
    }
}

/*
 * Please enter your word :: eefaaaccccdlllljjjjj
 * {a=3, c=4, d=1, e=2, f=1, j=5, l=4}
 * {a=3, c=4, e=2, j=5, l=4}
 * {a=3, c=4, e=2, j=5, l=4}
 */