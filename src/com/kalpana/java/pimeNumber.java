package com.kalpana.java;

public class pimeNumber {
   public static void main (String[] args) {
       int count = 0;
       int n = 5;
       for (int i = 1; i < n; i++)
           if (n % i == 0)
               count++;

       if (count == 2)
           System.out.println("yes");
       else
           System.out.println("no");
   }


}
