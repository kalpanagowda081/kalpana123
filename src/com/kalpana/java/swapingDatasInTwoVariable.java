package com.kalpana.java;

public class swapingDatasInTwoVariable {
    public static void main(String [] args){
        int num1 = 20;
        int num2 = 30;
        System.out.println("n1:"+num1);
        System.out.println("n2 :"+num2);
        int num3 = num1;
        num1 = num2;
        num2 =num3;
        System.out.println("n1 :"+num1+"/nn2:"+num2);


      //  num1 = num1+num2;
      //  num2 = num1-num2;
       // num1 -= num2;
       // System.out.println("n1 :"+num1+"/nn2:"+num2);

        num1 = num1*num2;
        num2 = num1/num2;
        num1 /= num2;
        System.out.println("n1 :"+num1+"/nn2:"+num2);


    }
}
