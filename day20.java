import java.util.*;

public class day20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q77 Multiply Matrices
        System.out.println("Matrix Multiplication");
        int[][] A = {
            {1, 2},
            {3, 4}
        };

        int[][] B = {
            {5, 6},
            {7, 8}
        };

        int[][] C = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Result Matrix:");
        for (int[] row : C) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // Q78 Check Symmetric Matrix
        System.out.println("\nCheck Symmetric Matrix");
        int[][] matrix = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        boolean symmetric = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }

        if (symmetric)
            System.out.println("Matrix is Symmetric");
        else
            System.out.println("Matrix is Not Symmetric");

        // Q79 Row-wise Sum
        System.out.println("\nRow-wise Sum");
        int[][] arr1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < arr1.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr1[i].length; j++) {
                sum += arr1[i][j];
            }
            System.out.println("Sum of Row " + (i + 1) + " = " + sum);
        }

        // Q80 Column-wise Sum
        System.out.println("\nColumn-wise Sum");
        int[][] arr2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int j = 0; j < arr2[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < arr2.length; i++) {
                sum += arr2[i][j];
            }
            System.out.println("Sum of Column " + (j + 1) + " = " + sum);
        }

        sc.close();
    }
}