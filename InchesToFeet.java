import java.util.Scanner;

/**
 * converts inches to feet
 * @author Suyash Patel
 */
public class InchesToFeet {

    /**
     * twelve
     */
    public static final double TWELVE = 12.0;

    /**
     * main method
     * @param args arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter inches:");
        double inches = scanner.nextDouble();
        double feet = inches / TWELVE;
        System.out.println("Feet: " + feet);
        scanner.close();
    }
}
