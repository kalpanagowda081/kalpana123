package com.kalpana.java;

import java.sql.SQLOutput;

public class minimumAndMaximumInArray {
    public static void main(String[] args) {
//        int a[] = {40, 80, 30, 70};


        minimumAndMaximumInArray m = new minimumAndMaximumInArray();
        int[] a = {40, 80, 30, 70};

       int min =m.minAndmax(a);
        System.out.println(min);
   }

    public int minAndmax(int a[]) {
        int min = a[0];
        for (int i = 1; i > a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }

        }
        return min;


    }
}




