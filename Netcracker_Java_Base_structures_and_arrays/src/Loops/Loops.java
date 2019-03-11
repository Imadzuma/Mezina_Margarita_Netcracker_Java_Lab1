package Loops;

public class Loops {
    public static void main(String[] args) {
        // Task A
        int size = 8;
        System.out.println("<----TASK0---->");
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j)
                System.out.print("# ");
            System.out.println();
        }
        System.out.println();

        // Task B(a)
        System.out.println("<----TASK1---->");
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j)
                System.out.print((j <= i) ? "# " : "  ");
            System.out.println();
        }
        System.out.println();

        // Task B(b)
        System.out.println("<----TASK2---->");
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j)
                System.out.print((j < size - i) ? "# " : "  ");
            System.out.println();
        }
        System.out.println();

        // Task B(c)
        System.out.println("<----TASK3---->");
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j)
                System.out.print((j >= i) ? "# " : "  ");
            System.out.println();
        }
        System.out.println();

        // Task B(d)
        System.out.println("<----TASK4---->");
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j)
                System.out.print((j >= size - 1 - i) ? "# " : "  ");
            System.out.println();
        }
        System.out.println();

        // Task B(e)
        System.out.println("<----TASK5---->");
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j)
                System.out.print(((j == 0) || (j == size - 1) || (i == 0) || (i == size - 1)) ? "# " : "  ");
            System.out.println();
        }
        System.out.println();

        // Task B(f)
        System.out.println("<----TASK6---->");
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j)
                System.out.print(((i == 0) || (i == size - 1) || (i == j)) ? "# " : "  ");
            System.out.println();
        }
        System.out.println();

        // Task B(g)
        System.out.println("<----TASK7---->");
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j)
                System.out.print(((i == 0) || (i == size - 1) || (i == size - 1 - j)) ? "# " : "  ");
            System.out.println();
        }
        System.out.println();

        // Task B(h)
        System.out.println("<----TASK8---->");
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j)
                System.out.print(((i == 0) || (i == size - 1) || (i == size - 1 - j) || (i == j)) ? "# " : "  ");
            System.out.println();
        }
        System.out.println();

        // Task B(h)
        System.out.println("<----TASK9---->");
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j)
                System.out.print(((i == 0) || (i == size - 1) || (j == 0) || (j == size - 1) || (i == size - 1 - j) || (i == j)) ? "# " : "  ");
            System.out.println();
        }
        System.out.println();
    }
}
