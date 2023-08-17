package Projects;

import java.util.Scanner;

public class FibonacciNumberBelong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it belongs to Fibonacci series:");
        int num = Integer.parseInt(sc.nextLine());

        boolean itBelongs = CheckNumberBelongsFibonacci(num);
        if(itBelongs){
            System.out.println("The number " + num + " belongs to the Fibonacci series" );
        }
        else {
            System.out.println("The number " + num + " doesn't belong to the Fibonacci series" );
        }
    }

    static boolean CheckNumberBelongsFibonacci (int num){
        boolean isFibonacciNumber = false;
        int a = 0;
        int b = 1;
        int i = 0;
        while ( i < 500) {
            i = a + b;
            // System.out.println(i);
            if(i == num || num == a || num == b){
                isFibonacciNumber = true;
            }
            a = b;
            b = i;
        }

        return isFibonacciNumber;
    }
}
