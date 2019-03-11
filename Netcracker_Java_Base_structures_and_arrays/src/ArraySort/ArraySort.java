package ArraySort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraySort {

    static long bubbleSort(int[] arr) {
        long startTime = System.nanoTime();
        boolean finish = false;
        while(!finish) {
            finish = true;
            for (int i = 0; i < arr.length - 1; ++i) {
                if (arr[i] > arr[i+1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    finish = false;
                }
            }
        }
        long finishTime = System.nanoTime();
        return finishTime - startTime;
    }

    static long selectionSort(int[] arr) {
        long startTime = System.nanoTime();
        for(int i = 0; i < arr.length; ++i) {
            int minElem = i;
            for (int j = i + 1; j < arr.length; ++j)
                minElem = arr[minElem] > arr[j] ? j : minElem;
            if (minElem != i) {
                int tmp = arr[i];
                arr[i] = arr[minElem];
                arr[minElem] = tmp;
            }
        }
        long finishTime = System.nanoTime();
        return finishTime - startTime;
    }

    static long arraySort(int[] arr) {
        long startTime = System.nanoTime();
        Arrays.sort(arr);
        long finishTime = System.nanoTime();
        return finishTime - startTime;
    }

    public static void main(String[] args) {
        // Enter info
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = in.nextInt();
        System.out.print("Enter true, if should write information, else enter false: ");
        boolean writing = in.nextBoolean();

        // Generate matrix
        int[] arr = new int[size];
        int[] arrForBubbleSort = new int[size];
        int[] arrForSelectionSort = new int[size];
        int[] arrForArraySort = new int[size];
        Random rand = new Random();
        for(int i = 0; i < size; ++i) {
            arr[i] = arrForArraySort[i] = arrForBubbleSort[i] = arrForSelectionSort[i] = rand.nextInt(1000);
        }
        if (writing) {
            System.out.println("Generate array:");
            for(int elem: arr)
                System.out.print(elem + " ");
            System.out.println();
        }

        // BubbleSort
        long bubbleSortTime = bubbleSort(arrForBubbleSort);
        if (writing) {
            System.out.println("Array after BubbleSort:");
            for(int elem: arrForBubbleSort)
                System.out.print(elem + " ");
            System.out.println();
        }
        System.out.println("BubbleSort time: " + bubbleSortTime);

        // SelectionSort
        long selectionSortTime = selectionSort(arrForSelectionSort);
        if (writing) {
            System.out.println("Array after SelectionSort:");
            for(int elem: arrForSelectionSort)
                System.out.print(elem + " ");
            System.out.println();
        }
        System.out.println("SelectionSort time: " + selectionSortTime);

        // ArraySort
        long arraySort = arraySort(arrForArraySort);
        if (writing) {
            System.out.println("Array after ArraySort:");
            for(int elem: arrForArraySort)
                System.out.print(elem + " ");
            System.out.println();
        }
        System.out.println("ArraySort time: " + arraySort);
    }
}
