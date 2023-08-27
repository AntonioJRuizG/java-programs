package Projects;

import java.io.Serializable;
import java.util.Scanner;

import static java.lang.Math.PI;

public class AngleTrigonometricValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter angle in degrees to calculate trigonometric values:");
        double angle = Double.parseDouble(sc.nextLine());
        double sin;
        double cos;
        Serializable tan;

        sin = getAngleSin(angle);
        sin = roundNumber(sin, 3);
        cos = getAngleCos(angle);
        cos = roundNumber(cos, 3);
        System.out.println("Result: ");
        System.out.println("sin("+angle+")= " + sin);
        System.out.println("cos("+angle+")= " + cos);

        tan = (Math.abs(cos) < 1e-10 ? "undefined" : roundNumber(sin/cos, 3));
        System.out.println("tg("+angle+")= " + tan);
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

    static double getAngleCos(double angle){
        double angleInRad = degreesToRad(angle);
        double cos = 0;
        double a;
        int b;
        double c;
        double d;

        for(int i = 0; i< 15; i++){
            a = numberPower(-1, i);
            b = 2 * i;
            c = factorial(b);
            d = numberPower(angleInRad, b);
            cos += a / c * d;
        }

        return cos;
    }

    static double degreesToRad (double angleInDegrees ){
        double angleInRad;
        // double piNumber = 3.1415927;
        angleInRad = angleInDegrees * PI / 180;
        return angleInRad;
    }

    static  double factorial (int number){
        double result = number;
        if (number == 0) {
            return 1;
        } else {
            for (int i = number; i > 1; i--) {
                result = result * (i - 1);
            }
            return result;
        }
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
        return Math.round(number * factor) / factor;
    }

    static double generateNumberWithZeros(int numberOfZeros) {
        if (numberOfZeros < 0) {
            throw new IllegalArgumentException("Number of zeros must be positive");
        }

        return Double.parseDouble("1" + "0".repeat(numberOfZeros));
    }
}
