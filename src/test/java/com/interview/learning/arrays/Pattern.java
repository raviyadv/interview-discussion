package com.interview.learning.arrays;

public class Pattern {
    public static void main(String[] args) {
        int len=6;
        for(int i=0;i<17;i++)
        {
            for(int j=0;j<=len;j++)
            {
                if(i%len==0 ||(i+j)%len==0)
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
