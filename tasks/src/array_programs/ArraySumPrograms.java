package array_programs;

public class ArraySumPrograms {

    public static void main(String[] args) {
        char [] charArray = {'A', '1' , '@', '2', 'a', 'g', 'a', '4'};
        findSumOfDifferentLetters(charArray);
    }
/**
 * @description this method is used to find sum of the different letters.
 * @param array <code>int[]</code>
 */
    public static void findSumOfDifferentLetters(char[] array) {
        int countOfAlphabets = 0;
        int countOfDigits = 0;
        int countOfSpeChar = 0;
        for (int i = 0; i < array.length; i++) {
            int ch = array[i];
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                countOfAlphabets++;
            } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                countOfAlphabets++;
            } else if (ch >= '0' && ch <= '9') {
                countOfDigits++;
            } else {
                countOfSpeChar++;
            }
        }
        System.out.println("count of alphabets :: " + countOfAlphabets + ", digits :: " + countOfDigits + ", other character :: " + countOfSpeChar);
    }
}
/*
count of alphabets :: 3, digits :: 3, other character :: 2
 */