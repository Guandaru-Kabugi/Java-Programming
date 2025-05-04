import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args){
        //initialize the scanner
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the size of the matrix
        System.out.println("Enter the size of the square matrix:");
        int n = scanner.nextInt();

        //declare and initialize matrix
        int[][] mat = new int[n][n];

        // Step 3: Read the matrix elements
        

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter details of the matrix for " + i + " " + j);
                mat[i][j] = scanner.nextInt();
            }
        }

        // Step 4: Initialize the sum of diagonals
        int sum = 0;

        // Step 5: Calculate the sum of the primary diagonal
        for (int i = 0; i < n; i++) {
            sum += mat[i][i]; // the reason for this is since we have a matrix starting at index 00 to 22, the i are similar
            // hence it will be 00,11,22, which is a diagonal as the i is the same.
        }

        // Step 6: Calculate the sum of the secondary diagonal
        for (int i = 0; i < n; i++) {
            // Avoid counting the middle element twice in case of an odd-sized matrix
            if (i != n - 1 - i) { //here, we want to skip indices [1][1] in the middle
                // if i=1 then n-1-i will be 3-1-1 which gives 1. therefore, i=1, which will be 1=1 hence we will skip it.
                sum += mat[i][n - 1 - i];
            }
        }

        // Step 7: Output the result
        System.out.println("The sum of the primary and secondary diagonals is: " + sum);

        scanner.close();
    }
}
