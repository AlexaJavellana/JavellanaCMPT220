/*
 * file: Problem62.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 3
 * due date: September 22 2016
 * version: 1.0
 *
 * This file contains problem 6.3, which asks for a program to provide the
 * reversal of a given integer and evaluate whether or not it is a palindrome.
 */

import java.util.Scanner;

public class Problem63 {
  public static void main(String [] args) {
  Scanner input = new Scanner(System.in);

  System.out.println("Please enter an integer:");
  int n = input.nextInt();

  System.out.println("The reversal of the integers is " + reverse(n));

    if (isPalindrome(n)) {
      System.out.println(n + " is a palindrome");
    } else {
      System.out.println(n + " is not a palindrome");
    }
  }

  public static int reverse(int n) {
  int reverse = 0;

    while (n != 0) {
      reverse = reverse * 10;
      reverse = reverse + n % 10;
      n = n/10;
    }

  return reverse;
  }

  public static boolean isPalindrome(int n) {
     return (n == reverse(n));
  }
  
}
