package string_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Occurrence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your word to check occurrence :: ");
        String word = scanner.next();
        //findOccurrence(word);
        findOccurrenceByMap(word);
    }

    /**
     * @description this method is used to find the occurrence of characters.
     * @param word <code>String</code>
     */
    public static void findOccurrence(String word){
        char [] charArray = word.toCharArray();
        boolean [] check = new boolean[charArray.length];
        for(int i = 0 ; i < charArray.length ; i++){
            if(!check[i]){
            int occurrence = 1;
            for (int j = i+1 ; j < charArray.length; j++) {
                if(charArray[i] == charArray[j]){
                    occurrence++;
                    check[j] = true;
                }
            }
            System.out.println(charArray[i]+" == "+occurrence);
            }
        }
    }

    /**
     * @description this method is used to find the occurrence of characters by using maps.
     * @param word <code>String</code>
     */
    public static Map<Character,Integer> findOccurrenceByMap(String word){
        Map<Character, Integer> occurrence = new HashMap<>();
        for(char ch : word.toCharArray()){
            if(occurrence.containsKey(ch)){
                occurrence.put(ch, 1+occurrence.get(ch));
            }else{
                occurrence.put(ch, 1);
            }
        }
        System.out.println(occurrence);
        return  occurrence;
    }
}