package com.kalpana.java;

public class forLoopForEachLoop {
    public static void main(String[] args) {
        String[] names = {"sachin", "rohith", "ganguly"};
        for (int i = 0; i < names.length; i++) {


            System.out.println(names[i]);
        }
        for (String name : names) {
            System.out.println(name);

            for (int i = names.length - 1; i >= 0; i--) {
                System.out.println(names[i]);
            }


        }

    }
}



