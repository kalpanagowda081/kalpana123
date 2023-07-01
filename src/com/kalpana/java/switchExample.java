package com.kalpana.java;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class switchExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the values");
        int num = scanner.nextInt();
        getmonthNameusingswitch(num);

    }

    public static String getmonthNameusingswitch(int month) {
        String str = "";
        switch (month) {

            case 1:
                System.out.println("jan");
                break;


            case 2:
                System.out.println("feb");

                break;
            default:
                System.out.println("invalid");

        }
        return str;


    }
}