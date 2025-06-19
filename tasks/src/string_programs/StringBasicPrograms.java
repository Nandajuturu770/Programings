package string_programs;

import java.util.Scanner;

public class StringBasicPrograms {

    public static void main(String[] args) {
        // to read the data from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter your string ::");
        String word = scanner.nextLine();
        System.out.println("reverse of the given '"+word+"' is :: "+reverseString(word));
        System.out.println("the given word '"+word+"' is palindrome :: "+checkPalindromeString(word));
    }

    /**
     * @description this method is used to reverse the string.
     * @param word           <code>String</code>
     * @return reverseString <code>String</code>
     */
    public static String reverseString(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = word.length()-1; i >= 0; i--) {
            stringBuilder.append(word.charAt(i));
        }
        return stringBuilder.toString();
    }

    /**
     * @description this method is used to check the palindrome string.
     * @param string  <code>String</code>
     * @return status <code>boolean</code>
     */
    public static boolean checkPalindromeString(String string){
        int lastIndex = string.length()-1;
        for(int i = 0; i <= (string.length()-1)/2; i++){
            if(string.charAt(i) != string.charAt(lastIndex--)){
                return false;
            }
        } 
        return true;
    }
}
/*
please enter your string ::rotator
reverse of the given 'rotator' is :: rotator
the given word 'rotator' is palindrome :: true
*/