/*
 * file: Problem51.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 3
 * due date: September 22 2016
 * version: 1.0
 *
 * This file contains problem 5.1
 */
 import java.util.Scanner;

 public class Problem51 {
   public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter integers, which must end with 0:");

    int p = input.nextInt();
    int np = 0;
    int nn = 0;
    double sumn = 0;
    double avgn = 0;
    int n = 0;

    if (p == 0)
      return;

    do {
      if (p > 0)
        np++;
      else
        nn++;
      sumn += p;
      p = input.nextInt();
    } while (p != 0);

    avgn = sumn/((double)(np+nn));

    System.out.println("The number of positives is " + np);
    System.out.println("The number of negatives is " + nn);
    System.out.println("The total is " + sumn);
    System.out.println("The average is " + avgn);
   }
 }
