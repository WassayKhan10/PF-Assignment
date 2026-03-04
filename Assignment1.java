import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking rows and columns
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        // Creating matrix
        int[][] arr = new int[rows][cols];

        // Taking input
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Row sum
        System.out.println("Row sums:");
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println("Row " + (i + 1) + " = " + sum);
        }

        // Column sum
        System.out.println("Column sums:");
        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum = sum + arr[i][j];
            }
            System.out.println("Column " + (j + 1) + " = " + sum);
        }

        // Diagonal sum (only if square matrix)
        if (rows == cols) {
            int d1 = 0;
            int d2 = 0;

            for (int i = 0; i < rows; i++) {
                d1 = d1 + arr[i][i];
                d2 = d2 + arr[i][rows - 1 - i];
            }

            System.out.println("Forward diagonal sum = " + d1);
            System.out.println("Reverse diagonal sum = " + d2);
        } else {
            System.out.println("No diagonal sum (not a square matrix)");
        }

        sc.close();
    }
}