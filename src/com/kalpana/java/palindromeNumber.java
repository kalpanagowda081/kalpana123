package com.kalpana.java;

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values");
        int num = sc.nextInt();
        int org_num = num;
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        if (org_num == rev) {
            System.out.println(org_num + "  palindrome number");
        } else {
            System.out.println(org_num + "  palindrome not number");
        }
    }
}