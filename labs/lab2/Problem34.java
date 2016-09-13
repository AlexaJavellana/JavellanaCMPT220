/*
 * file: Problem34.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 2
 * due date: September 14 2016
 * version: 1.2
 *
 * This file contains problem 3.4, which asks for a program that when a
 * random number for 1-12 is generated, the appropriate month according
 * to the value is then presented. 
 */

public class Problem34 {
  public static void main(String[] args) {
  int randomNumber;

  randomNumber = (int)(Math.random() * 12) + 1;

  if(randomNumber == 1) {
      System.out.println("January");
  } else if(randomNumber == 2) {
      System.out.println("February");
  } else if(randomNumber == 3) {
      System.out.println("March");
  } else if(randomNumber == 4) {
      System.out.println("April");
  } else if(randomNumber == 5) {
      System.out.println("May");
  } else if(randomNumber == 6) {
      System.out.println("June");
  } else if(randomNumber == 7) {
      System.out.println("July");
  } else if(randomNumber == 8) {
      System.out.println("August");
  } else if(randomNumber == 9) {
      System.out.println("September");
  } else if(randomNumber == 10) {
      System.out.println("October");
  } else if(randomNumber == 11) {
      System.out.println("November");
  } else if(randomNumber == 12) {
      System.out.println("December");
  }
  }
}
