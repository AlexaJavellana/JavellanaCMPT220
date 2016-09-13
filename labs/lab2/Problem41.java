/*
 * file: Problem41.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 2
 * due date: September 14 2016
 * version: 1.2
 *
 * This file contains problem 4.1, which prompts the user to enter a vertex
 * length of a pentagon to determine the area.
 */

import java.util.Scanner;

public class Problem41 {
  public static void main(String [] args) {
  Scanner input = new Scanner(System.in);

  System.out.println("Enter a length from the center to the vertex:");
  double r = input.nextDouble();
  double s = 2 * r * Math.sin(Math.PI / 5);

  double area = 5 * Math.pow(s, 2) / 4 * Math.tan(Math.PI / 5);

  area = Math.round(area * 100) / 100.0;

  System.out.println("The area of the pentagon is " + area);
  }
}
