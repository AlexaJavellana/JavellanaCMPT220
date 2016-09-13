/*
 * file: Problem38.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 2
 * due date: September 14 2016
 * version: 1.2
 *
 * This file contains problem 3.8, which asks for a program that takes three
 * integers and puts them in increasing order. 
 */

import java.util.Scanner;

public class Problem38 {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.println("Please enter three integers.");
  int number1 = input.nextInt();
  int number2 = input.nextInt();
  int number3 = input.nextInt();

  if((number1 <= number2) && (number1 <= number3)) {
    if(number2 <= number3) {
      System.out.println(number1 + ", " + number2 + ", " + number3);
    } else {
      System.out.println(number1 + ", " + number3 + ", " + number2);
    }
  } else if((number2 <= number1) && (number2 <= number3)) {
    if(number1 <= number3) {
      System.out.println(number2 + ", " + number1 + ", " + number3);
    } else {
      System.out.println(number2 + ", " + number3 + ", " + number1);
    }
  } else {
    if(number1 <= number2) {
      System.out.println(number3 + ", " + number1 + ", " + number2);
    } else {
      System.out.println(number3 + ", " + number2 + ", " + number1);
    }
    }
  }
}
