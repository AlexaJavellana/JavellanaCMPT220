/*
 * file: Problem426.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 2
 * due date: September 14 2016
 * version: 1.2
 *
 * This file contains problem 4.26, which asks to rewrite Listing 2.10
 * regarding currency, and instead of using int, indexOf and substring
 * should be utilized.
 */

import java.util.Scanner;

public class Problem426 {
  public static void main (String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.print("Enter a total in double, for example 11.56: ");
    String total = input.next();
    int totalSingles = Integer.parseInt(total.substring(0, total.indexOf('.')));
    int remainingTotal = Integer.parseInt(total.substring(total.indexOf('.')+1));

    int totalQuarters = remainingTotal / 25;
    remainingTotal = remainingTotal % 25;

    int totalDimes = remainingTotal / 10;
    remainingTotal = remainingTotal % 10;

    int totalNickels = remainingTotal / 5;
    remainingTotal = remainingTotal % 5;

    int totalPennies = remainingTotal;

  System.out.println("Your amount " + total + " has");
  System.out.println("    " + totalSingles + " dollars");
  System.out.println("    " + totalQuarters + " quarters ");
  System.out.println("    " + totalDimes + " dimes");
  System.out.println("    " + totalNickels + " nickels");
  System.out.println("    " + totalPennies + " pennies");
  }
}
