/*
 * file: Problem26.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 1
 * due date: September 7, 2016
 * version: 1.2
 *
 * This file contains problem 2.6
 */

import java.util.Scanner;

public class Problem26 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number between 0 and 1000 :");
      int number = input.nextInt();

      int ones = number % 10;
      int tens = (number / 10) % 10 ;
      int hundreds = (number / 100) % 10;

      int sum = ones + tens + hundreds;

    System.out.println("The sum of the digits is " + sum);
  }
}
