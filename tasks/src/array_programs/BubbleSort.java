package array_programs;

import java.util.Scanner;

public class BubbleSort {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("please enter length of the array :: ");
        int length = scanner.nextInt();
        int[] array = getArray(length);
        System.out.println("\nascending order :: ");
        printArrayElements(ascendingBubbleSort(array));
        System.out.println("\ndescending order :: ");
        printArrayElements(descendingBubbleSort(array));
    }

    /**
     * @description this method is used to get an int array.
     * @param length <code>int</code>
     * @return array <code>int[]</code?
     */
    public static int[] getArray(int length) {
        int array[] = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.print("please enter " + (i + 1) + " your number :: ");
            array[i] = scanner.nextInt();
        }
        printArrayElements(array);
        return array;
    }

    /**
     * @description this method is used to sort the elements of the array in
     * ascending order.
     * @param array           <code>int[]</code>
     * @return ascendingArray <code>int[]</code>
     */
    public static int[] ascendingBubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int swipe = array[i];
                    array[i] = array[j];
                    array[j] = swipe;
                }
            }
        }
        return array;
    }

    /**
     * @description this method is used to sort the elements of the array in
     * descending order.
     * @param array           <code>int[]</code>
     * @return ascendingArray <code>int[]</code>
     */
    public static int[] descendingBubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int swipe = array[i];
                    array[i] = array[j];
                    array[j] = swipe;
                }
            }
        }
        return array;
    }

    /**
     * @description this method is used to print the element of array.
     * @param array <code>int[]</code>
     */
    public static void printArrayElements(int[] array) {
        System.out.println("your array element are below please check ::");
        for (int element : array) {
            System.out.print(element + ", ");
        }
    }
}
/*
please enter length of the array :: 5
please enter 1 your number :: 3
please enter 2 your number :: 6
please enter 3 your number :: 7
please enter 4 your number :: 8
please enter 5 your number :: 1
your array element are below please check ::
3, 6, 7, 8, 1,
ascending order ::
your array element are below please check ::
1, 3, 6, 7, 8,
descending order ::
your array element are below please check ::
8, 7, 6, 3, 1,
 */