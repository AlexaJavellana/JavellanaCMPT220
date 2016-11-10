/*
 * file: Problem21.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 1
 * due date: September 7, 2016
 * version: 1.2
 *
 * This file contains problem 2.1
 */

import java.util.Scanner;

public class Problem21 {
  public static void main(String[] args) {
    // == the following line is incorrectly indented
    Scanner input = new Scanner(System.in);

    System.out.print("Enter degrees in celsius to convert into farenheit. ");
    double celsius = input.nextDouble();

    double farenheit; // Declares farenheit

    farenheit = (9.0 / 5.0) * celsius + 32;

    System.out.println("The degree in fareneheit for " + celsius + " degrees celsius is "
      + farenheit + " degrees.");
  }
}
