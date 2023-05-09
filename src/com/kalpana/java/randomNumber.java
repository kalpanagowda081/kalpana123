package com.kalpana.java;

import java.util.Random;

public class randomNumber {
  public static void main (String[] args){
      Random rand = new Random();
      int rand_int = rand.nextInt(100);
      System.out.println(rand_int);

      if(rand_int%2==0)
      {
          System.out.println(rand_int+ " is even number");
      }
      else {
          System.out.println(rand_int+ " is odd number");
      }
  }







}
