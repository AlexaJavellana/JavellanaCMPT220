/*
 * file: PercentageProgram2.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 2
 * due date: September 14 2016
 * version: 1.2
 *
 * This file contains a revised version of the percentage program due in lab1
 */

import java.util.Scanner;

public class PercentageProgram2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the following scores (0-100)...");

    System.out.print("Midterm Exam: ");
    int midterm=input.nextInt();

    System.out.print("Final Exam: ");
    int exam = input.nextInt();

    System.out.print("Projects: ");
    int projects = input.nextInt();

    System.out.print("Homework and Labs: ");
    int hwlabs = input.nextInt();

    double fgrade;
    fgrade = ((midterm * 0.2) + (exam * 0.2) + (projects * 0.2) + (hwlabs * 0.4));

    if (fgrade <= 100 && fgrade >= 95)
      System.out.println("Your final grade is: A");
    else if (fgrade < 95 && fgrade >= 90)
      System.out.println("Your final grade is: A-");
    else if (fgrade < 90 && fgrade >= 87)
      System.out.println("Your final grade is: B+");
    else if (fgrade < 87 && fgrade >= 83)
      System.out.println("Your final grade is: B");
    else if (fgrade < 83 && fgrade >= 80)
      System.out.println("Your final grade is: B-");
    else if (fgrade < 80 && fgrade >= 77)
      System.out.println("Your final grade is: C+");
    else if (fgrade < 77 && fgrade >= 73)
      System.out.println("Your final grade is: C");
    else if (fgrade < 73 && fgrade >= 70)
      System.out.println("Your final grade is: C-");
    else if (fgrade < 70 && fgrade >= 65)
      System.out.println("Your final grade is: D");
    else
      System.out.println("Your final grade is: F");
  }
}
