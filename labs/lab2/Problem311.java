/* Alexa Javellana
CMPT220

Write a program that prompts the user to enter the
month and year and displays the number of days in the
month. For example, if the user entered month 2 and year
2012, the program should display that February 2012 had
29 days. If the user entered month 3 and year 2015, the
program should display that March 2015 had 31 days. */

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
