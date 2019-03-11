package IfElseSwitch;

import java.util.Random;

public class IfElseSwitch {

    enum Mark {BAD("Bad"), SATISFACTORY("Satisfactory"), GOOD("Good"), VERY_GOOD("Very good"), EXCELLENT("Excellent");
        private String name;
        Mark(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

    };

    static void enumTask() {
        System.out.println("ENUM TASK:");
        Mark[] marks = new Mark[5];
        marks[0] = Mark.BAD;
        marks[1] = Mark.SATISFACTORY;
        marks[2] = Mark.GOOD;
        marks[3] = Mark.VERY_GOOD;
        marks[4] = Mark.EXCELLENT;

        // IfElse
        System.out.println("Test \"If-Else\" construction:");
        long startTime = System.nanoTime();
        for (int i = 0; i < 5; ++i) {
            if (marks[i].getName() == "Bad")
                System.out.println("\t" + marks[i].getName() + " mark: It's very bad:((((");
            else if (marks[i].getName() == "Satisfactory")
                System.out.println("\t" + marks[i].getName() + " mark: Not bad, but you can study better!");
            else if (marks[i].getName() == "Good")
                System.out.println("\t" + marks[i].getName() + " mark: Oooo... I'm glad for you:)");
            else if (marks[i].getName() == "Very good")
                System.out.println("\t" + marks[i].getName() + " mark: Cool! It's very cool!!!! *o*");
            else
                System.out.println("\t" + marks[i].getName() + " mark: O_o How can you do it?!?");
        }
        long finishTime = System.nanoTime();
        System.out.println("Time: " + (finishTime - startTime));

        // SwitchCase
        System.out.println("Test \" Switch-Case\t construction:");
        startTime = System.nanoTime();
        for (int i = 0; i < 5; ++i) {
            switch (marks[i].getName()) {
                case "Bad":
                    System.out.println("\t" + marks[i].getName() + " mark: It's very bad:((((");
                    break;
                case "Satisfactory":
                    System.out.println("\t" + marks[i].getName() + " mark: Not bad, but you can study better!");
                    break;
                case "Good":
                    System.out.println("\t" + marks[i].getName() + " mark: Oooo... I'm glad for you:)");
                    break;
                case "Very good":
                    System.out.println("\t" + marks[i].getName() + " mark: Cool! It's very cool!!!! *o*");
                    break;
                default:
                    System.out.println("\t" + marks[i].getName() + " mark: O_o How can you do it?!?");
                    break;
            }
        }
        finishTime = System.nanoTime();
        System.out.println("Time: " + (finishTime - startTime));
        System.out.println();
    }
    static void arrayTask() {
        System.out.println("ARRAY TASK:");
        int size = 50;
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; ++i)
            arr[i] = rand.nextInt(11);
        System.out.println("Generate array:");
        for (int i = 0; i < size; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();

        // IfElse
        System.out.println("Test \"If-Else\" construction:");
        int[] countIfElse = new int[11];
        long startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            if (arr[i] == 0) countIfElse[0]++;
            else if (arr[i] == 1) countIfElse[1]++;
            else if (arr[i] == 2) countIfElse[2]++;
            else if (arr[i] == 3) countIfElse[3]++;
            else if (arr[i] == 4) countIfElse[4]++;
            else if (arr[i] == 5) countIfElse[5]++;
            else if (arr[i] == 6) countIfElse[6]++;
            else if (arr[i] == 7) countIfElse[7]++;
            else if (arr[i] == 8) countIfElse[8]++;
            else if (arr[i] == 9) countIfElse[9]++;
            else countIfElse[10]++;
        }
        long finishTime = System.nanoTime();
        for (int i = 0; i <= 10; ++i) {
            System.out.println("\t" + i + ") " + countIfElse[i]);
        }
        System.out.println("Time: " + (finishTime - startTime));

        // SwitchCase
        System.out.println("Test \" Switch-Case\t construction:");
        int[] countSwitch = new int[11];
        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            switch (arr[i]) {
                case 0: countSwitch[0]++; break;
                case 1: countIfElse[1]++; break;
                case 2: countIfElse[2]++; break;
                case 3: countSwitch[3]++; break;
                case 4: countSwitch[4]++; break;
                case 5: countSwitch[5]++; break;
                case 6: countSwitch[6]++; break;
                case 7: countSwitch[7]++; break;
                case 8: countSwitch[8]++; break;
                case 9: countSwitch[9]++; break;
                default: countSwitch[10]++; break;
            }
        }
        finishTime = System.nanoTime();
        for (int i = 0; i <= 10; ++i) {
            System.out.println("\t" + i + ") " + countSwitch[i]);
        }
        System.out.println("Time: " + (finishTime - startTime));
        System.out.println();
    }

    public static void main(String[] args) {
        // EnumTask
        enumTask();

        // ArrayTask
        arrayTask();
    }
}
