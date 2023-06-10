package com.kalpana.java;

public class duplicteValues {
    public static void main(String[] args){
        int [] a = {3,3,4};
        for(int i = 0;i<a.length;i++){
            for(int j= i+1;j<a.length;j++){
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                }
            }

        }




    }





}
