/*
 * file: Problem513.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 3
 * due date: September 22 2016
 * version: 1.0
 *
 * This file contains problem 5.13, which prompts to use a while loop to find
 * the smallest integer n such that n3 is greater than 12,000. 
 */

public class Problem513 {
  public static void main (String [] args) {

  int n = 1;

  while (Math.pow(n, 3) <= 12000) {
    n++;
  }

  System.out.println("The smallest integer n such that n^3 is greater than " +
    "12,000 is " + n);

   }
 }
