/*
 * file: Problem45.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 2
 * due date: September 14 2016
 * version: 1.2
 *
 * This file contains problem 4.5, which prompts the user to enter the number
 * of sides and length of the sides of a polygon to determine area.
 */

import java.util.Scanner;

public class Problem45 {
  public static void main (String [] args) {
  Scanner input = new Scanner(System.in);

  System.out.println("Enter the number of sides:");
  double n = input.nextDouble();
  System.out.println("Enter the length of the side:");
  double s = input.nextDouble();

  double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));

  System.out.println("The area of the polygon is " + area);

  }
}
