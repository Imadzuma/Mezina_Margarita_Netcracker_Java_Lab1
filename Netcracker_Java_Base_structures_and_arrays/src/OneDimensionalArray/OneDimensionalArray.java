package OneDimensionalArray;

import java.util.Random;

public class OneDimensionalArray {
    static void task1() {
        System.out.println("TASK1:");
        int size = 50;
        int[] arr = new int[size];
        for (int i = 0; i < size; ++i)
            arr[i] = 2 * i + 1;
        System.out.println("Array in ascending order:");
        for (int i = 0; i < size; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("Array in descending order:");
        for (int i = size - 1; i >= 0; --i)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println();
    }
    static void task2() {
        System.out.println("TASK2:");
        int size = 20;
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; ++i)
            arr[i] = rand.nextInt(11);
        System.out.println("Generate array:");
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < size; ++i) {
            if (arr[i]%2 == 0) evenCount++;
            else oddCount++;
        }
        for (int i = 0; i < size; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("Count of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + oddCount);
        System.out.println();
    }
    static void task3() {
        System.out.println("TASK3:");
        int size = 10;
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; ++i)
            arr[i] = rand.nextInt(100) + 1;
        System.out.println("Generate array:");
        for (int i = 0; i < size; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        for (int i = 1; i < size; i+=2)
            arr[i] = 0;
        System.out.println("Update array:");
        for (int i = 0; i < size; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println();
    }
    static void task4() {
        System.out.println("TASK4");
        int size = 15;
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; ++i)
            arr[i] = rand.nextInt(101) - 50;
        System.out.println("Generate array:");
        for (int i = 0; i < size; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        int minI = 0, maxI = 0;
        for (int i = 0; i < size; ++i) {
            minI = (arr[minI] >= arr[i]) ? i : minI;
            maxI = (arr[maxI] <= arr[i]) ? i : maxI;
        }
        System.out.println("Min element: value=" + arr[minI] + ", index=" + minI);
        System.out.println("Max element: value=" + arr[maxI] + ", index=" + maxI);
        System.out.println();
    }
    static void task5() {
        System.out.println("TASK5:");
        int size = 10;
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; ++i) {
            arr1[i] = rand.nextInt(11);
            arr2[i] = rand.nextInt(11);
        }
        System.out.println("Generate array 1:");
        for (int i = 0; i < size; ++i)
            System.out.print(arr1[i] + " ");
        System.out.println();
        System.out.println("Generate array 2:");
        for (int i = 0; i < size; ++i)
            System.out.print(arr2[i] + " ");
        System.out.println();
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < size; ++i) {
            sum1 += arr1[i];
            sum2 += arr2[i];
        }
        System.out.println("Average value of array 1: " + sum1/(double)10);
        System.out.println("Average value of array 2: " + sum2/(double)10);
        if (sum1 > sum2)
            System.out.println("First array has bigger average value");
        if (sum1 == sum2)
            System.out.println("Arrays have equal average values");
        if (sum1 < sum2)
            System.out.println("Second array has bigger average value");
        System.out.println();
    }
    static void task6() {
        System.out.println("TASK6");
        int size = 20;
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; ++i)
            arr[i] = rand.nextInt(3) - 1;
        System.out.println("Generate array:");
        for (int i = 0; i < size; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        int count0 = 0, countPlus1 = 0, countMinus1 = 0;
        for (int i = 0; i < size; ++i) {
            switch (arr[i]) {
                case -1: countMinus1++; break;
                case 0: count0++; break;
                case 1: countPlus1++; break;
            }
        }
        int maxCount = Math.max(count0, Math.max(countMinus1, countPlus1));
        System.out.print("The most frequent elements:");
        if (maxCount == count0)
            System.out.print(" 0");
        if (maxCount == countMinus1)
            System.out.print(" -1");
        if (maxCount == countPlus1)
            System.out.print(" 1");
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        // Task 1
        task1();

        // Task 2
        task2();

        // Task 3
        task3();

        // Task 4
        task4();

        // Task 5
        task5();

        // Task 6
        task6();
    }
}
