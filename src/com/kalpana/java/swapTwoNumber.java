package com.kalpana.java;

public class swapTwoNumber {
    public static void main (String [] args){
        int a = 2;
        int b = 5;
        System.out.println("just printing the numbers before swaping the numbers");
        System.out.println("a = " + a);
        System.out.println("b = "  + b);
 /*int temp = a;
 a=b;
 b=temp;*/
a = a+b;
b = a-b;
a = a-b;
        System.out.println("just printing the numbers after swaping the numbers");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

int[] arr = new int[2];
arr[0] = 10;
arr[1] = 20;

        System.out.println(arr[0]);
        System.out.println(arr[1]);






    }



}


