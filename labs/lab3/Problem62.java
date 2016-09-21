/*
 * file: Problem62.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 3
 * due date: September 22 2016
 * version: 1.0
 *
 * This file contains problem 6.2: Write a method that computes the sum of the
 * digits in an integer. Use the following method header:
 * public static int sumDigits(long n)
 */

import java.util.Scanner;

public class Problem62 {
  public static void main(String [] args) {
  Scanner input = new Scanner(System.in);

  System.out.println("Please enter an integer:");
  long n = input.nextLong();

  System.out.println("The sum of the integers is " + sumDigits(n));

  }

  public static int sumDigits(long n) {

    int sum = 0;
    do {
      sum += n % 10;
    } while ((n = n / 10) != 0);

    return sum;
  }
}
