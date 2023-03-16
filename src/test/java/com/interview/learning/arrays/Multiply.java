package com.interview.learning.arrays;

public class Multiply {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {4, 5}, {7, 8}};
        int[][] b = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int[][] multiply = new int[a.length][b[0].length];
        System.out.println(a[0].length);
        if (a[0].length == b.length) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int k = 0; k < b.length; k++) {
                        multiply[i][j] += a[i][k] * b[k][j];
                    }
                    System.out.print(multiply[i][j] + " ");
                }
                System.out.println();
            }
        }
        else
            System.out.println("first array column is not same sa second array row");

    }
}
