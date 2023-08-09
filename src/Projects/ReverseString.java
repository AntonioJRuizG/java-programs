package Projects;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Reverse string:");
        System.out.println(reverseString("Hello, World"));

    }

    static String reverseString(String str){
        char[] strArray = str.toCharArray();
        char reversed;
        StringBuilder result = new StringBuilder();
        for (int i = strArray.length - 1; i >= 0 ; i--) {
            reversed = strArray[i];
            result.append(reversed);
        }
        return result.toString();
    }
}
