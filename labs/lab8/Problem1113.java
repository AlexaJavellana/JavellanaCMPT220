/*
 * file: Problem1113.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 8
 * due date: November 4th 2016
 * version: 1.0
 *
 * This file contains problem Problem 11.13
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Problem1113 {
  public static void main(String[] args) {

  System.out.print("Enter ten integers: ");
 	Scanner input = new Scanner(System.in);
 	ArrayList<Integer> list = new ArrayList<>();
 	  for (int i = 0; i < 10; i++)
 		 list.add(input.nextInt());
  
  System.out.print("The distinct intergers are: ");
  removeDuplicate(list);
  System.out.println(list);
	}

	public static void removeDuplicate(ArrayList<Integer> list) {

	 ArrayList<Integer> temp = new ArrayList<>();
	   for (int i = 0; i < list.size(); i++) {
		  if (!temp.contains(list.get(i))) {
			 temp.add(list.get(i));
			}
		  }	
			
      list.clear();
      list.addAll(temp);
	}
}