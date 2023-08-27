package Projects;

import java.util.Scanner;

import static java.lang.Math.PI;

public class AngleTrigonometricValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter angle in degrees to calculate trigonometric values:");
        double angle = Double.parseDouble(sc.nextLine());
        double sin;
        double cos;
        double tan;

        sin = getAngleSin(angle);
        sin = roundNumber(sin, 3);
        System.out.println("Result: ");
        System.out.println("sin("+angle+")= " + sin);
    }

    static double getAngleSin(double angle){
        double angleInRad = degreesToRad(angle);
        double sin = 0;
        double a;
        int b;
        double c;
        double d;

        for(int i = 0; i< 15; i++){
            a = numberPower(-1, i);
            b = 2 * i + 1;
            c = factorial(b);
            d = numberPower(angleInRad, b);
            sin += a / c * d;
        }

        return sin;
    }

    static double degreesToRad (double angleInDegrees ){
        double angleInRad;
        // double piNumber = 3.1415927;
        double piNumber = PI;
        angleInRad = angleInDegrees * piNumber / 180;
        return angleInRad;
    }

    static  double factorial (int number){
        double result = number;
        for (int i = number; i > 1; i--){
            result = result * (i-1);
        }
        return result;
    }

    static double numberPower (double number, int power){
        double result = number;
        if (power == 0) {
            result = 1;
        } else {
            for (int i = 1; i < power; i++) {
                result *= number;
            }
        }
        return result;
    }

    static double roundNumber (double number, int decimal){
        double factor = generateNumberWithZeros(decimal);
        double roundedNumber = Math.round(number * factor) / factor;
        return  roundedNumber;
    }

    static double generateNumberWithZeros(int numberOfZeros) {
        if (numberOfZeros < 0) {
            throw new IllegalArgumentException("Number of zeros must be positive");
        }

        StringBuilder sb = new StringBuilder("1");
        for (int i = 0; i < numberOfZeros; i++) {
            sb.append("0");
        }

        double result = Double.parseDouble(sb.toString());
        return result;
    }
}
