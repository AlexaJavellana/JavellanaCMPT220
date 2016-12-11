/*
 * file: Problem123.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 9
 * due date: november 10 2016 
 * version: 1.0
 *
 * This file contains problem 12.3, which asks: 
 *Write a program that meets the following requirements:
 *Creates an array with 100 randomly chosen integers.
 *Prompts the user to enter the index of the array, then displays the corre-
 *sponding element value. If the specified index is out of bounds, display the 
 *message Out of Bounds.
 */

import java.util.Scanner;

public class Problem123 {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  int[] randomArray = new int[100];
  for (int i = 0; i < 100; i++) 
    randomArray[i] = (int)(Math.random() * 100);

  System.out.println("Enter the index of the array randomArray: ");
  try {
  int index = input.nextInt();
  System.out.println("In randomArray[" + index + "] the value is: " + 
                    randomArray[index]);
  }
  catch (IndexOutOfBoundsException ex) {
    System.out.println("The index is not part of randomArray");
  }
  }
}