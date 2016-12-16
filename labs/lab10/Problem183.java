/*
 * file: Problem183.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 10
 * due date: November 17th 2016
 * version: 1.0
 *
 * The gcd(m, n) can also be defined recursively as follows:
 * Ifm % nis0,gcd(m, n)isn.
 * Otherwise,gcd(m, n)isgcd(n, m % n).
 * Write a recursive method to find the GCD. Write a test program 
 * that prompts the user to enter two integers and displays their GCD.
 */

import java.util.Scanner;

public class Problem183 {
  public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

  System.out.print("Enter the first number: ");
  long i1 = input.nextLong();
  System.out.print("Enter the second number: ");
  long i2 = input.nextLong();

  System.out.println("The GCD of the two numbers is: " + gcd(i1, i2));
  }	

  public static long gcd(long a, long b) {
    if (b==0)
      return a;
    else
      return gcd(b, a % b);
  }
}