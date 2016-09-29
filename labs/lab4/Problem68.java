/*
 * file: Problem68.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 4
 * due date: September 29 2016
 * version: 1.0
 *
 * This file contains problem 6.8, which asks for a program that converts
 * celsius to farenheit and vice versa for a table of values.
 */


public class Problem68 {
  public static void main(String [] args) {

    System.out.format("    Celsius   Fahrenheit  |  Fahrenheit   Celsius\n");
    for (double cel= 40.0, far= 120; cel>30.0; cel-=1, far-=10) {
    double [] myList = new double[100];
      System.out.format("%10.1f %10.1f | %10.1f %10.1f \n", cel, Cel2Far(cel),
                       far, Far2Cel(far));
    }
  }

  public static double Cel2Far (double cel) {
  return (9.0 / 5.0) * (cel + 32.0);

  }

  public static double Far2Cel (double far) {
  return (5.0 / 9.0) * (far - 32.0);
  }
}
