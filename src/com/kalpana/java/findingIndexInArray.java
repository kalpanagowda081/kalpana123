package com.kalpana.java;

public class findingIndexInArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 44, 7, 34, 6, 34, 895, 6, 18};
        int target = 7;

        int ans = indexoftheArray(arr,target);
        System.out.println(ans);

    }

    public static int indexoftheArray( int[] arr,int target) {


        int i;
        for (i = 0; i <= arr.length; i++) {


            if (arr[i] == target) {
                return i;
            }

        }


        return - i;
    }



}
