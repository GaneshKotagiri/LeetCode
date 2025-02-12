package matrix;

import java.util.Scanner;


public class matrix {

    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key found at " + i + ", " + j);
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        // Populate the 2D array
        System.out.println("Enter 9 elements for a 3x3 matrix.matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output the 2D array
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Search for a key
        System.out.print("Enter the key to search for: ");
        int key = sc.nextInt();
        search(matrix, key);

        // Close the scanner
        sc.close();
    }
}