package com.interview.learning.operator;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        int a = 32;
        int b = -a;
        System.out.println(a);
        Test t = new Test();
        Test t1 = new Test();
        System.out.println(t instanceof Array);

        System.out.println(t==t1);
        System.out.println(4&5);
        System.out.println(4|5);
        System.out.println(4^5);

        if(false&true){
            System.out.println("hello bitwise");
        }

        if(true&&false){
            System.out.println("hello logical");
        }
        byte b1 = 20;

        // a1 = b1+b1; //- (int( typeof, typeof)

        System.out.println(createObject(String.class));

        //type casting

        Object o = new StringBuffer("Hello");
        String s = (String) o;
        System.out.println(s.length());

        String s1 = new String("huuu");
        Object o1 = s1;
        long l =10l;
        int i = (int)l;
    }

    public static Object createObject(Class cl) throws InstantiationException, IllegalAccessException {

       // return cl.newInstance();

        System.out.println(ArrayList.class.getConstructors().length);
        return null;
    }
}
