package com.kalpana.java;

import java.util.Scanner;

public class largestOfThreeNumbers {
    public static void main (String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter first number");
          int a =  sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        System.out.println("enter the third number");
         int c= sc.nextInt();
        if (a > b && a > c) {
            System.out.println(a + "is the largest number");
        }
        else if(b>a && b>c) {
            System.out.println(b + "is the largest number");
        }
        else
        {
            System.out.println(c+ "is the largest number");


        }
    }
}