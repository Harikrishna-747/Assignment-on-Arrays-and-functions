import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double sum = calculateSum(num1, num2);
            System.out.println("Sum: " + sum);

            System.out.print("Do you want to continue? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program stopped.");
    }

    // Function to calculate sum
    public static double calculateSum(double num1, double num2) {
        return num1 + num2;
    }
}
