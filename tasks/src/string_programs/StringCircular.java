package string_programs;

import java.util.Scanner;

public class StringCircular {

    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your string : ");
        String string = scanner.next();
        System.out.println("Array Circular :"+arrayCircular(string));
        System.out.println("Character Circular : "+characterCircular(string));
    }

    /**
     * This method is used to find string is circular or not
     * @param string <code>{@link String}</code>
     * @return result <code>boolean</code>
     */
    public static boolean characterCircular(String string){
        String lowercase = string.toLowerCase();
        char ch = 'a';
        int start = 0 ;
        for(int i = 0; i < string.length() ; i++){
            if(lowercase.charAt(i) == 'a'){
                start = i; ch++;
                for(int j = start+1 ; j < lowercase.length() ; j++){
                    if(ch == lowercase.charAt(j)){
                        ch++;
                    }else{
                        return false;
                    }
                }
                break;
            }
        }
        for(int i = 0 ; i < start ; i++){
            if(lowercase.charAt(i) == ch){
                ch++;
            }else{
                return false;
            }
        }
        return true;
    }

    /**
     * This method is used to find the sorting of the give string.
     * @param string <code>{@link String}</code>
     * @return result <code>boolean</code>
     */
    public static boolean arrayCircular(String string){
        char [] charArray = string.toCharArray();
        int length = charArray.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if(charArray[i] > charArray[(i+1)%length]){
                count++;
            }
        }
        return count == 1;
    }
}
/*
 * Please enter your string : jklabcdefghi
 * Array Circular :true
 * Character Circular : true
 */