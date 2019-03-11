package Factorial;

import java.util.Scanner;

public class Factorial {

    static int FindFactorial(int n) {
        if (n == 1)
            return 1;
        return n * FindFactorial(n-1);
    }

    public static void main(String[] args) {
        // Enter Info
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = in.nextInt();

        // Find factorial using loop
        long startTime = System.nanoTime();
        int resultLoop = 1;
        for (int i = 1; i <= n; ++i)
            resultLoop *= i;
        long finishTime = System.nanoTime();
        System.out.println("Find factorial using loop: " + resultLoop);
        System.out.println("Time: " + (finishTime - startTime));

        // Find factorial using recursion
        startTime = System.nanoTime();
        int resultRecursion = FindFactorial(n);
        finishTime = System.nanoTime();
        System.out.println("Find factorial using recursion: " + resultRecursion);
        System.out.println("Time: " + (finishTime - startTime));
    }
}
