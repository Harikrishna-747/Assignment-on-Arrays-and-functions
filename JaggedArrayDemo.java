public class JaggedArrayDemo {
    public static void main(String[] args) {
        // Declare and initialize a jagged array
        int[][] jaggedArray = {
            {1, 2, 3},          // Row 0 has 3 elements
            {4, 5},             // Row 1 has 2 elements
            {6, 7, 8, 9},       // Row 2 has 4 elements
            {10}                // Row 3 has 1 element
        };

        // Printing the jagged array
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}
