public class ArrayDemo {
    public static void main(String[] args) {
        // Integer array
        int[] intArray = {1, 2, 3, 4, 5};

        // Double array
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        // Character array
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};

        // Displaying elements of integer array
        System.out.println("Integer Array:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element at index " + i + ": " + intArray[i]);
        }

        // Displaying elements of double array
        System.out.println("\nDouble Array:");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println("Element at index " + i + ": " + doubleArray[i]);
        }

        // Displaying elements of character array
        System.out.println("\nCharacter Array:");
        for (int i = 0; i < charArray.length; i++) {
            System.out.println("Element at index " + i + ": " + charArray[i]);
        }
    }
}

