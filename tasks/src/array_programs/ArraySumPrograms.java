package array_programs;

public class ArraySumPrograms {

    public static void main(String[] args) {
        char[] charArray = {'A', '1', '@', '2', 'a', 'g', 'a', '4'};
        findSumOfDifferentLetters(charArray);
        int[] array1 = {1, 2, 3, 5, 4};
        int[] array2 = {1, 2, 3, 4};
        SortingArray.printArrayElements(addArrays(array1, array2));
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

    /**
     * @description this method is used to add to arrays based on length of the
     * array.
     * @param array1     <code>int[]</code>
     * @param array2    <code>int[]</code>
     * @return sumArray <code>int[]</code>
     */
    public static int[] addArrays(int[] array1, int[] array2) {
        if (array1.length <= array2.length) {
            return add(array1, array2);
        } else {
            return add(array2, array1);
        }
    }

    /**
     * @description this method is used to add to arrays. array.
     * @param array1     <code>int[]</code>
     * @param array2    <code>int[]</code>
     * @return sumArray <code>int[]</code>
     */
    private static int[] add(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            if (i < array1.length) {
                array2[i] = array1[i] + array2[i];
            }
        }
        return array2;
    }
}
/*
count of alphabets :: 3, digits :: 3, other character :: 2
your array element are below please check ::
2, 4, 6, 9, 4,
 */
