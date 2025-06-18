package array_programs;

import static array_programs.SortingArray.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayBasicPrograms {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter length of the array :: ");
        int length = scanner.nextInt();
        int[] array = getArray(length);
        printArrayReserve(array);
        int[] reverseArray = reverseArray(array);
        printArrayElements(reverseArray);
        System.out.println("\nsum of the array elements is :: " + sumOfArrayElements(array));
        System.out.println("smallest numbers of array is :: " + findSmallestNumberOfArray(array));
        System.out.println("biggest number of array is :: " + findBiggestNumberOfArray(array));
        System.out.println("duplicate elements in array :: " + duplicateElementInArray(array));
    }

    /**
     * @description this method is used to print element reverse of array.
     * @param array <code>int[]</code>
     */
    public static void printArrayReserve(int[] array) {
        System.out.print("\nreverse of array is  :: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }

    /**
     * @description this method is used to give reverse the given array.
     * @param array         <code>int[]</code>
     * @return reverseArray <code>int[]</code>
     */
    public static int[] reverseArray(int[] array) {
        int startElement = 0;
        int endElement = array.length - 1;
        while (startElement <= endElement) {
            int temp = array[startElement];
            array[startElement] = array[endElement];
            array[endElement] = temp;
            startElement++;
            endElement--;
        }
        return array;
    }

    /**
     * @description this method is used to sum the element of the given array.
     * @param array <code>int[]</code>
     * @return sum  <code>int</code>
     */
    public static int sumOfArrayElements(int array[]) {
        int sum = 0;
        for (int arrayElement : array) {
            sum += arrayElement;
        }
        return sum;
    }

    /**
     * @description this method is used to find the biggest number of the array.
     * @param array          <code>int[]</code>
     * @return biggestNumber <code>int</code>
     */
    public static int findBiggestNumberOfArray(int array[]) {
        int biggestNumber = array[0];
        for (int number : array) {
            if (biggestNumber < number) {
                biggestNumber = number;
            }
        }
        return biggestNumber;
    }

    /**
     * @description this method is used to find the smallest number of the
     * array.
     * @param array           <code>int[]</code>
     * @return smallestNumber <code>int</code>
     */
    public static int findSmallestNumberOfArray(int array[]) {
        int smallestNumber = array[0];
        for (int number : array) {
            if (smallestNumber > number) {
                smallestNumber = number;
            }
        }
        return smallestNumber;
    }

    /**
     * @description this method is used to find the duplicate elements in the
     * array.
     * @param array             <code>int[]</code>
     * @return listOfDuplicates <code>List</code>
     */
    public static List<Integer> duplicateElementInArray(int[] array) {
        List<Integer> listOfDuplicates = new ArrayList<>();
        boolean[] falseArray = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            int duplicate = 1;
            if (!falseArray[i]) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        duplicate++;
                        falseArray[j] = true;
                    }
                }
            }
            if (duplicate > 1) {
                listOfDuplicates.add(array[i]);
            }
        }
        return listOfDuplicates;

    }
}
/*
please enter length of the array :: 5
please enter 1 your number :: 1
please enter 2 your number :: 2
please enter 3 your number :: 3
please enter 4 your number :: 2
please enter 5 your number :: 3
your array element are below please check ::
1, 2, 3, 2, 3,
reverse of array is  :: 3, 2, 3, 2, 1
your array element are below please check ::
3, 2, 3, 2, 1,
sum of the array elements is :: 11
smallest numbers of array is :: 1
biggest number of array is :: 3
duplicate elements in array :: [3, 2]
*/
