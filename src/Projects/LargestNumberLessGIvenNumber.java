package Projects;

import java.util.Scanner;

/*  How to find the largest number less than a given number and without a given digit?
    Write a Java program to find the largest number ‘L’ less than a given number ‘N’
    which should not contain a given digit ‘D’. For example, If 145 is the given number
    and 4 is the given digit, then you should find the largest number less than 145 such
    that it should not contain 4 in it. In this case, 139 will be the answer. */
public class LargestNumberLessGIvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("Enter a digit: ");
        int digit = Integer.parseInt(sc.nextLine());
        System.out.println("Given number: " + number + ", given digit: " + digit);
        System.out.println();
        System.out.println("The largest number less than de given number without the digit is: ");
        System.out.println(FindLargestNumberLessGivenDigit(number, digit));
    }

    static int FindLargestNumberLessGivenDigit (int number, int digit){
        int result = 0;
        String digitString = Integer.toString(digit);

        for (int i = number; i > digit; i--) {
            if (!Integer.toString(i).contains(digitString)) {
                result = i;
                break;
            }
        }

        return result;
    }
}
