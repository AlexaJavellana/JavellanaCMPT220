/*
 * file: Problem415.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 2
 * due date: September 14 2016
 * version: 1.2
 *
 * This file contains problem 4.15, which asks for a program that, in
 * correspondance to a phone number pad, when a letter is entered, the
 * associated number will be given. 
 */

import java.util.Scanner;

public class Problem415 {
  public static void main (String[] args) {

  System.out.print("Please enter a single lowercase letter:");
  Scanner input = new Scanner(System.in);
  String letter = input.next();

  char pad = letter.charAt(0);
  int number;

  switch (pad) {
  case 'a':
  case 'b':
  case 'c':
    number = 2;
    break;

  case 'd':
  case 'e':
  case 'f':
    number = 3;
    break;

  case 'g':
  case 'h':
  case 'i':
    number = 4;
    break;

  case 'j':
  case 'k':
  case 'l':
    number = 5;
    break;

  case 'm':
  case 'n':
  case 'o':
    number = 6;
    break;

  case 'p':
  case 'q':
  case 'r':
  case 's':
    number = 7;
    break;

  case 't':
  case 'u':
  case 'v':
    number = 8;
    break;

  case 'w':
  case 'x':
  case 'y':
  case 'z':
    number = 9;
    break;

  default:
    number = 0;
    break;
  }

  if (number != 0)
    System.out.println("The corresponding number is " + number);
  else
    System.out.println(pad + " is an invalid input");

  }
}
