package com.kalpana.java;

public class perfectNumber {
    public static void main(String[] args) {


        int sum = 0;
        int n = 6;
        for (int i = 1; i < n; i++){
            if(n%i==0)
                sum =sum+i;
            if(sum==n)
                System.out.println("yes");
            else
                System.out.println("no");
        }

    }
}