import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare arrays to store marks and totals
        int[][] marks = new int[5][3];
        int[] totals = new int[5];
        double[] averages = new double[5];

        // Input marks for 5 students and calculate totals
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextInt();
                totals[i] += marks[i][j];
            }
            averages[i] = (double) totals[i] / 3;
        }

        // Displaying totals and averages for each student
        System.out.println("\nStudent\t\tTotal\t\tAverage");
        for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i + 1) + "\t\t" + totals[i] + "\t\t" + averages[i]);
        }
    }
}

