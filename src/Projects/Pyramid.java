package Projects;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String rows;
        int number = 0;
        boolean validInput = false;

        do {
            System.out.println("Introduce number of rows in the pyramid: ");
            rows = sc.nextLine();

            try {
                number = Integer.parseInt(rows);
                validInput = true;
            } catch (Exception e){
                System.out.println("Please enter a number:");
            }


            if (number > 9){
                number = 9;
                System.out.println("To much rows. Printing a 9 rows pyramid.");
            }
        } while (!validInput);

        PyramidPattern1(number);
        System.out.println();
        PyramidPattern2(number);
        System.out.println();
        PyramidPattern3(number);
        System.out.println();
        PyramidPattern4(number);
        System.out.println();
        PyramidPattern5(number);
        System.out.println();
        PyramidPattern6(number);
    }
    static void PyramidPattern1(int number){
        for (int i = 1; i <= number; i++) {
            for (int j = i; j < number; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void PyramidPattern2(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < number - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void PyramidPattern3 (int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void PyramidPattern4 (int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void PyramidPattern5 (int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print(j+" ");
            }
            for (int j = rows - i; j >= 1; j--) {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }

    static void PyramidPattern6 (int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int j = rows; j > rows-i; j--) {
                System.out.print(j+" ");
            }
            for (int j = rows-i+2; j <= rows; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
