package Projects;

import java.util.Scanner;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence to be cleaned from spaces: ");
        String sentence = sc.nextLine();
        System.out.println(removeWhiteSpaces(sentence));
        sc.close();
    }
    static String removeWhiteSpaces(String str){
        System.out.println("Sentence w/o spaces: ");
        char auxChar;
        char[] strChars = str.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char strChar : strChars) {
            auxChar = strChar;
            if (auxChar != ' ' && auxChar != '\t') {
                result.append(auxChar);
            }
        }
        return result.toString();
    }
}
