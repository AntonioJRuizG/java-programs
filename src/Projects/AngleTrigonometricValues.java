package Projects;

public class AngleTrigonometricValues {
    public static void main(String[] args) {

    }

    static int getAngleSin(int angleInRad){
        int sin = angleInRad;
        return sin;
    }

    static double degreesToRad (double angleInDegrees ){
        double angleInRad;
        angleInRad = angleInDegrees * 3.1416 / 180;
        return angleInRad;
    }

    static  int factorial (int number){
        int result = number;
        for (int i = number; i > 1; i--){
            result = result * (i-1);
        }
        return result;
    }
}
