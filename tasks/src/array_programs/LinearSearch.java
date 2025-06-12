package array_programs;

import static array_programs.BubbleSort.*;
import java.util.Scanner;

public class LinearSearch {

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
            System.out.println(searchElement + " is presented in array");
        } else {
            System.out.println(searchElement + " is not presented in array");

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
3 is presented in array
 */
