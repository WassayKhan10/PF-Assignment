import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How big should the matrix be? Enter a number: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        int mainDiagonalSum = 0;
        int reverseDiagonalSum = 0;

        System.out.println("enter the numbers for the matrix one by one:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter number for position [row " + i + "][col " + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nHere is your matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n--- Row and Column Sums ---");

        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;

            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }

            System.out.println("Row " + i + " total = " + rowSum);
            System.out.println("Column " + i + " total = " + colSum);
        }

        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i];
            reverseDiagonalSum += matrix[i][n - 1 - i];
        }

        System.out.println("\nMain diagonal sum (top-left to bottom-right): " + mainDiagonalSum);
        System.out.println("Reverse diagonal sum (top-right to bottom-left): " + reverseDiagonalSum);

        scanner.close();
    }
}