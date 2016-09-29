/*
 * file: Problem620.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 4
 * due date: September 29 2016
 * version: 1.0
 *
 * This file contains problem 6.20, which asks for a program that counts the
 * number of letters in a string using a countLetters method.
 */

import java.util.Scanner;

public class Problem620 {
  public static void main(String [] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Please enter a string: ");
  String s = input.nextLine();

  System.out.println("The length of your string is " + countLetters(s) );
  }

  public static int countLetters(String s) {

  int countLetters = 0;
  countLetters = s.length();

  return countLetters;
  }
}
