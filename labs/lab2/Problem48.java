/*
 * file: Problem48.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 2
 * due date: September 14 2016
 * version: 1.2
 *
 * This file contains problem 4.8, which prompts the user to enter a ASCII
 * code and in return delivers the corresponding character. 
 */

import java.util.Scanner;

public class Problem48 {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.println("Enter a ASCII code:");
  int code = input.nextInt();

  System.out.println("The character for ASCII code " + code + " is " + (char) code);
  }
}
