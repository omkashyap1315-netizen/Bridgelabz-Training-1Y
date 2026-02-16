package com.gla.classesobjects.level3;

public class MatrixOperations {

    // Method 1: Create random matrix
    public static int[][] createMatrix(int r, int c) {

        int[][] m = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = (int)(Math.random() * 10); // 0–9 numbers
            }
        }
        return m;
    }

    // Method 2: Display matrix
    public static void display(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method 3: Addition
    public static int[][] add(int[][] A, int[][] B) {

        int r = A.length;
        int c = A[0].length;
        int[][] sum = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        return sum;
    }

    // Method 4: Subtraction
    public static int[][] subtract(int[][] A, int[][] B) {

        int r = A.length;
        int c = A[0].length;
        int[][] diff = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                diff[i][j] = A[i][j] - B[i][j];
            }
        }
        return diff;
    }

    // Method 5: Multiplication
    public static int[][] multiply(int[][] A, int[][] B) {

        int r1 = A.length;
        int c1 = A[0].length;
        int c2 = B[0].length;

        int[][] prod = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    prod[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return prod;
    }

    public static void main(String[] args) {

        int r = 2, c = 2;   // you can change size

        int[][] A = createMatrix(r, c);
        int[][] B = createMatrix(r, c);

        System.out.println("Matrix A:");
        display(A);

        System.out.println("\nMatrix B:");
        display(B);

        System.out.println("\nAddition:");
        display(add(A, B));

        System.out.println("\nSubtraction (A-B):");
        display(subtract(A, B));

        System.out.println("\nMultiplication (A*B):");
        display(multiply(A, B));
    }
}
