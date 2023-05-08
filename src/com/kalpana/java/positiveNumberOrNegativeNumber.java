package com.kalpana.java;

import java.util.Scanner;

public class positiveNumberOrNegativeNumber {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int a = sc.nextInt();
        if(a==0){
            System.out.println(" it is a zero");
        }
        else if( a > 0) {
            System.out.println(a + " the given number is positive number");
        }
       else {
            System.out.println(a + " the given number is negative number");
        }
    }










}
