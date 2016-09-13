/*
 * file: Problem425.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 2
 * due date: September 14 2016
 * version: 1.2
 *
 * This file contains problem 4.25, which asks for a program that randomly
 * generates a license plate number with three random letters and four
 * random digits.
 */

public class Problem425 {
  public static void main (String[] args) {

  char one = (char)((int)(Math.random() * 26 + 65));
  char two = (char)((int)(Math.random() * 26 + 65));
  char three = (char)((int)(Math.random() * 26 + 65));

  int digits = (int)(Math.random() * 10000);

  System.out.println("The randomly generated plate number is "
    + one + two + three + digits);
  }
}
