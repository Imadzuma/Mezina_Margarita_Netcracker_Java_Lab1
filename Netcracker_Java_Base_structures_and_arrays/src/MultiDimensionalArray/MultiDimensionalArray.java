package MultiDimensionalArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MultiDimensionalArray {
    static void task1() {
        System.out.println("TASK1:");
        int size = 8;
        int[][] arr = new int[size][size];
        Random rand = new Random();
        for (int x = 0; x < size; ++x) {
            for (int y = 0; y < size; ++y)
                arr[x][y] = rand.nextInt(99) + 1;
        }
        System.out.println("Generate matrix:");
        for (int x = 0; x < size; ++x) {
            for (int y = 0; y < size; ++y)
                System.out.print(arr[x][y] + "\t");
            System.out.println();
        }
        long sumMainDiagonal = 0, multMainDiagonal = 1;
        long sumSecondaryDiagonal = 0, multSecondaryDiagonal = 1;
        for (int i = 0; i < size; ++i) {
            sumMainDiagonal += arr[i][i];
            multMainDiagonal *= arr[i][i];
            sumSecondaryDiagonal += arr[i][size - 1 - i];
            multSecondaryDiagonal *= arr[i][size - 1 - i];
        }
        System.out.println("In main diagonal: sum=" + sumMainDiagonal + ", mult=" + multMainDiagonal);
        System.out.println("In secondary diagonal: sum =" + sumSecondaryDiagonal + ", mult=" + multSecondaryDiagonal);
        System.out.println();
    }
    static void task2() {
        System.out.println("TASK2");
        int sizex = 8;
        int sizey = 5;
        int[][] arr = new int[sizex][sizey];
        Random rand = new Random();
        for (int x = 0; x < sizex; ++x) {
            for (int y = 0; y < sizey; ++y)
                arr[x][y] = rand.nextInt(201) - 99;
        }
        System.out.println("Generate matrix:");
        for (int x = 0; x < sizex; ++x) {
            for (int y = 0; y < sizey; ++y)
                System.out.print(arr[x][y] + "\t");
            System.out.println();
        }
        System.out.println("Max element in rows:");
        for (int x = 0; x < sizex; ++x) {
            int max = -100;
            for (int y = 0; y < sizey; ++y)
                max = (max < arr[x][y]) ? arr[x][y] : max;
            System.out.println("\t" + x + ") " + max);
        }
        System.out.println("Max element in colums:");
        for (int y = 0; y < sizey; ++y) {
            int max = -100;
            for (int x = 0; x < sizex; ++x)
                max = (max < arr[x][y]) ? arr[x][y] : max;
            System.out.println("\t" + y + ") " + max);
        }
        System.out.println();
    }
    static void task3() {
        System.out.println("TASK3");
        int sizex = 8;
        int sizey = 5;
        int[][] arr = new int[sizex][sizey];
        Random rand = new Random();
        for (int x = 0; x <sizex; ++x) {
            for (int y = 0; y < sizey; ++y)
                arr[x][y] = rand.nextInt(21) - 10;
        }
        System.out.println("Generate matrix");
        for (int x = 0; x < sizex; ++x) {
            for (int y = 0; y < sizey; ++y)
                System.out.print(arr[x][y] + "\t");
            System.out.println();
        }
        long[] mult = new long[sizex];
        for (int x = 0; x <sizex; ++x) {
            mult[x] = 1;
            for (int y = 0; y < sizey; ++y)
                mult[x] *= arr[x][y];
        }
        System.out.println("Multiply in rows:");
        for (int x = 0; x < sizex; ++x)
            System.out.println("\t" + x + ") " + mult[x]);
        long maxModule = 0;
        for (int x = 0; x <sizex; ++x)
            maxModule  = (maxModule < Math.abs(mult[x])) ? Math.abs(mult[x]) : maxModule;
        System.out.print("Max module in rows: ");
        for (int x = 0; x <sizex; ++x) {
            if (maxModule == Math.abs(mult[x]))
                System.out.print(x + " ");
        }
        System.out.println();
        System.out.println();

    }
    static void task4() {
        System.out.println("TASK4:");
        int sizex = 10;
        int sizey = 7;
        int[][] arr = new int[sizex][sizey];
        Random rand = new Random();
        for (int x = 0; x <sizex; ++x) {
            for (int y = 0; y < sizey; ++y)
                arr[x][y] = rand.nextInt(101);
        }
        System.out.println("Generate matrix: ");
        for (int x = 0; x <sizex; ++x) {
            for (int y = 0; y <sizey; ++y)
                System.out.print(arr[x][y] + "\t");
            System.out.println();
        }
        for (int x = 0; x < sizex; ++x) {
            Arrays.sort(arr[x]);
            for (int y = 0; y < sizey/2; ++y) {
                int tmp = arr[x][sizey - 1 - y];
                arr[x][sizey - 1 - y] = arr[x][y];
                arr[x][y] = tmp;
            }
        }
        System.out.println("Update matrix:");
        for (int x = 0; x < sizex; ++x) {
            for (int y = 0; y < sizey; ++y)
                System.out.print(arr[x][y] + "\t");
            System.out.println();
        }
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
    }
}
