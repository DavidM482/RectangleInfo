import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        boolean valid = false;
        double sideOne = 0;
        double sideTwo = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;

        do {
            System.out.println("Enter the length for side one.");
            if (scan.hasNextDouble()) {
                sideOne = scan.nextDouble();
                if (sideOne > 0) {
                    valid = true;
                } else {
                    System.out.println("You have entered an invalid value. Please try again.");
                }
            } else {
                System.out.println("You have entered an invalid value. Please try again.");
            }
            scan.nextLine();
        } while (!valid);

        valid = false;
        do {
            System.out.println("Enter a value for side two.");
            if (scan.hasNextDouble()) {
                sideTwo = scan.nextDouble();
                if (sideTwo > 0) {
                    valid = true;
                } else {
                    System.out.println("You have entered an invalid value. Please try again.");
                }
            } else {
                System.out.println("You have entered an invalid value. Please try again.");
            }
            scan.nextLine();
        } while (!valid);

        area = sideOne * sideTwo;
        perimeter = (sideOne * 2) + (sideTwo * 2);
        diagonal = Math.sqrt((Math.pow(sideOne, 2) + Math.pow(sideTwo, 2)));

        System.out.printf("%-15s %10.2f", "Side 1:", sideOne);
        System.out.printf("\n%-15s %10.2f", "Side 2:", sideTwo);
        System.out.printf("\n%-15s %10.2f", "Area:", area);
        System.out.printf("\n%-15s %10.2f", "Perimeter:", perimeter);
        System.out.printf("\n%-15s %10.2f", "Diagonal:", diagonal);
    }
}