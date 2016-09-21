/*
 * file: Problem57.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 3
 * due date: September 22 2016
 * version: 1.0
 *
 * This file contains problem 5.7, which supposes
 * that the tuition for a university is $10,000 this year and increases 5%
 * every year. In one year, the tuition will be $10,500. Write a program that
 * computes the tuition in ten years and the total cost of four years’ worth
 * of tuition after the tenth year.
 */

public class Problem57 {
  public static void main (String [] args) {
  int tuition = 10000;
  int year;
  int sumOfTuition = 0;


  for (year = 1; year <= 14; year++ ) {
    tuition += tuition * 0.05;
  if (year == 10)
    System.out.println("Tuition in ten years will be: " + tuition);

  if (year > 10)
    sumOfTuition = sumOfTuition + tuition;
  }

    System.out.println("The total cost of four years worth of tuition after the "
      +  "tenth year is " + sumOfTuition);

  }
}
