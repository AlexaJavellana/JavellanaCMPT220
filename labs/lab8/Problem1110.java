/*
 * file: Problem1110.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 8
 * due date: November 4th 2016
 * version: 1.0
 *
 * This file contains problem Problem 11.10
 (Implement MyStack using inheritance) In Listing 11.10,
  MyStack is imple- mented using composition. Define a new 
  stack class that extends ArrayList.
Draw the UML diagram for the classes and then implement
 MyStack. Write a test program that prompts the user to enter 
 five strings and displays them in reverse order.
 */

import java.util.Scanner;

public class Problem1110 {
  public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
  MyStack list = new MyStack();

  System.out.println("Enter 5 strings to be displayed in reverse order: ");

  for (int i = 0; i < 5; i++)
    list.push(input.next()); 
  
  while (list.size() > 0)  
  System.out.print(list.pop() + " ");
  }
}