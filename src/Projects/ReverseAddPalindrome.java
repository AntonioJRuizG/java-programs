package Projects;

import java.util.Scanner;

public class ReverseAddPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its palindrome: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(reverseAddPalindromeCalculator(number) + " (palindrome)");
    }

    static int reverseAddPalindromeCalculator(int inputNumber){
        int result = 0;
        boolean palindromeFound = false;
        int firstSummand = inputNumber;
        int secondSummand = reverseNumber(inputNumber);
        int additionOfSummands = firstSummand + secondSummand;
        int additionOfSummandsReversed = reverseNumber(additionOfSummands);

        if(inputNumber == reverseNumber(inputNumber)){
            result = inputNumber;
        } else {
            while(!palindromeFound){
                if(additionOfSummands == additionOfSummandsReversed){
                    palindromeFound = true;
                    result = additionOfSummands;
                } else {
                    additionOfSummands = additionOfSummands + reverseNumber(additionOfSummands);
                    additionOfSummandsReversed = reverseNumber(additionOfSummands);

                }
            }
        }


        return result;
    }

    static int reverseNumber(int number){
        int reversedNumber = 0;
        int auxNumber = number;
        int auxNumberLastInt = 0;
        if (number > 10){
            while (auxNumber > 0){
                reversedNumber = (reversedNumber * 10) + auxNumber%10;
                auxNumberLastInt = auxNumber%10;
                auxNumber = (auxNumber - auxNumberLastInt) / 10;
            }
        } else {
            reversedNumber = number;
        }

        return reversedNumber;
    }
}
