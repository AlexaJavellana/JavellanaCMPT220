/*
 * file: Problem311.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 2
 * due date: September 14 2016
 * version: 1.2
 *
 * This file contains problem 3.11, which asks for a program that when given
 * integers for month and year, the amount of days that had/will occur during
 * that month will be given.
 */

import java.util.Scanner;

public class Problem311 {
  public static void main (String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.println("Please enter a number for month (1 - January, 12 - December, etc.)");
  int month = input.nextInt();
  System.out.println("Please enter a year.");
  int year = input.nextInt();
  int days = 31;
  String monthName;

  switch (month) {
  case 2:
    if((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0)) {
    days = 29;
    break;
    }
    days = 28;
    break;

  case 4:
  case 6:
  case 9:
  case 11:
    days = 30;
  }

  switch (month) {
  case 1:
    monthName = "January";
    break;
  case 2:
    monthName = "February";
    break;
  case 3:
    monthName = "March";
    break;
  case 4:
    monthName = "April";
    break;
  case 5:
    monthName = "May";
    break;
  case 6:
    monthName = "June";
    break;
  case 7:
    monthName = "July";
    break;
  case 8:
    monthName = "August";
    break;
  case 9:
    monthName = "September";
    break;
  case 10:
    monthName = "October";
    break;
  case 11:
    monthName = "November";
    break;
  case 12:
    monthName = "December";
    break;
  default:
    monthName = "Please enter another number";
    days = 0;
    break;
  }

  System.out.println(monthName + " " + year + " had/will have " + days + " days");


  }
}
