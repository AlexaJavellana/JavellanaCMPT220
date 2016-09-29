/*
 * file: Problem79.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 4
 * due date: September 29 2016
 * version: 1.0
 *
 * This file contains problem 7.9, which asks for a program that takes
 * an array of ten number and returns the minimum value.
 */

import java.util.Scanner;

public class Problem79 {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter ten integers: ");
    double[] myList = new double[10];

  for (int i = 0; i < myList.length; i++)
    myList[i] = input.nextDouble();

  System.out.println("The minimum value in the list of values is: " +
                    min(myList));
  }

  public static double min(double[] myList) {
    double min = myList[0];

    for (int i = 0; i < myList.length; i++)
      if (min > myList[i]) {
      min = myList[i];
      }
  return min;
  }
}
