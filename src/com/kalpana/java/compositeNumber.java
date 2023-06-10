package com.kalpana.java;

public class compositeNumber {
    public static void main (String[] args){
       int count = 0;
       int n = 6;
       for(int i = 1;i<=n;i++){
           if(n%i ==0)
               count++;
           if(count>3)
               System.out.println("yes");
           else
               System.out.println("no");
       }



    }
}
