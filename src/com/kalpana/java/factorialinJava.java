package com.kalpana.java;

import java.util.Scanner;

public class factorialinJava {
  public static void main (String [] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("please enter the values");
      int a = sc.nextInt();

      int sum = 1;
      for(int i =1;i<=a;i++){
          sum = sum * i;
      }
      System.out.println(sum);

  }}