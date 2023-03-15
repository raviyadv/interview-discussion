package com.interview.learning.languageFundamental;

public class Array {
    public static void main(String[] args) {
        String[] strings = new String[5];
        int[] i = new int[]{10,20};
        int[] j = {10,20,30};

        int[][] a2 = {{10,20,30},{40},{50,60}};

        for (int[] a : a2){
            for(int val: a)
                System.out.println(val);
        }

    }

    // instance method
    public void test(){

    }
}
