package com.kalpana.java;

public class reverseString {
    public static void main (String[] args){
        String str = "hello";
         char [] chArr = str.toCharArray();
         for(int i = chArr.length-1;i>=0;i--){
             System.out.println(chArr[i]);
         }


    }



}
