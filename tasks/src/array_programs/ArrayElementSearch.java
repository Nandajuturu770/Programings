package array_programs;

import static array_programs.SortingArray.*;
import java.util.Scanner;

public class ArrayElementSearch {

    public static Scanner scanner;

    public static void main(String[] args) {
        // to read the data from the user
        scanner = new Scanner(System.in);
        System.out.print("please enter length of the array :: ");
        int length = scanner.nextInt();
        int array[] = getArray(length);
        System.out.print("\nplease enter your to search :: ");
        int searchElement = scanner.nextInt();
        if (linearSearch(array, searchElement)) {
            System.out.println(searchElement + " is presented in array with linear search");
        } else {
            System.out.println(searchElement + " is not presented in array linear search");
        }
        if (binarySearch(array, searchElement)) {
            System.out.println(searchElement + " is presented in array binary search");
        } else {
            System.out.println(searchElement + " is not presented in array binary search");
        }
    }

    /**
     * @description this method is used to search the element in array
     * @param array         <code>Int[]</code>
     * @param searchElement <code>int</code>
     * @return status       <code>boolean</code>
     */
    public static boolean linearSearch(int array[], int searchElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchElement) {
                return true;
            }
        }
        return false;
    }

    /**
     * @description this method is used to search the element in the array by
     * binary search.
     * @param array         <code>int[]</code>
     * @param searchElement <code>int</code>
     * @return status       <code>boolean</code>
     */
    public static boolean binarySearch(int array[], int searchElement) {
        array = SortingArray.ascendingBubbleSort(array);
        int initialPosition = 0;
        int finalPosition = array.length - 1;
        do {
            int middlePosition = (initialPosition + finalPosition) / 2;
            if (searchElement == array[middlePosition]) {
                return true;
            } else if (searchElement < array[middlePosition]) {
                finalPosition = middlePosition - 1;
            } else {
                initialPosition = middlePosition + 1;
            }

        } while (initialPosition <= finalPosition);
        return false;
    }
}
/*
please enter length of the array :: 4
please enter 1 your number :: 3
please enter 2 your number :: 5
please enter 3 your number :: 3
please enter 4 your number :: 1
your array element are below please check ::
3, 5, 3, 1,
please enter your to search : 3
3 is presented in array with linear search
3 is presented in array with binary search
 */
