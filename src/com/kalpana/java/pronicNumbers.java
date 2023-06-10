package com.kalpana.java;

public class pronicNumbers {
    public static void main(String[] args) {
        int fact = 0;
        int n = 56;
        for (int i = 1; i < n; i++)
            if (n % i == 0)

                if (i * (i + 1) == n)
                    if (fact != 0)
                        System.out.println("yes");
                    else
                        System.out.println("no");


    }
}