package com.kalpana.java;

import java.util.Scanner;

public class palindromeSting {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values");
        String str =sc.next();

        String org_st = str;

        String rev = "";

        int len = str.length();
        {
            for (int i = len-1;i>= 0;i--);
            rev = rev+str.charAt(3);
        }
        System.out.println(rev);
    }
}
