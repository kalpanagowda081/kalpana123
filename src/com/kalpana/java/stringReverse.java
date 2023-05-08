package com.kalpana.java;

import java.util.Scanner;

public class stringReverse {
    public static void main(String[] args){
        String str = "ABCD";
        String rev = null;
        int len = str.length();
        for(int i=len-1;i>=0;i--){
            rev = rev+str.charAt(i);}

            System.out.println("reversed string is" + rev);




    }




}
