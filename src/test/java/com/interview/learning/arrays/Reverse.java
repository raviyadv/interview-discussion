package com.interview.learning.arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5,6};
        int mid = a.length / 2;
        int j = a.length - 1;
        for (int i = 0; i < mid; i++) {
            int temp = a[j];
            a[j] = a[i];
            a[i] = temp;
            j--;
        }
        for (int i : a) {
            System.out.println(i);
        }
    }
}
