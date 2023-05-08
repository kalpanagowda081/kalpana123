package com.kalpana.java;

public class additionOperatorByUsingMethod {
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }

    public static void main (String[] args){
        additionOperatorByUsingMethod asm = new additionOperatorByUsingMethod();
        int a=asm.add(2,4);
      int b=  asm.sub(2,4);
        int c = asm.mul(2,4);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }






}
