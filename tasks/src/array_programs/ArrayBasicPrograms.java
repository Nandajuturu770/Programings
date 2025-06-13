package array_programs;

import static array_programs.BubbleSort.*;
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
}
/*
please enter length of the array :: 4
please enter 1 your number :: 2
please enter 2 your number :: 1
please enter 3 your number :: 3
please enter 4 your number :: 4
your array element are below please check ::
2, 1, 3, 4,
reverse of array is  :: 4, 3, 1, 2
your array element are below please check ::
4, 3, 1, 2,
 */
