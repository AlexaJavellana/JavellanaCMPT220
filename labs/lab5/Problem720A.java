/*
 * file: Problem720.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 5
 * due date: October 6, 2016
 * version: 1.2
 *
 * This file contains problem 7.2, which asks to revisit and revise a selection
 * program
 */

import java.util.Scanner;

public class Problem720A {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int[] myList = new int[5];

    System.out.println("Please enter five integers: ");
    for (int i = 0; i < myList.length; i++) {
      myList[i] = input.nextInt();
    }

    System.out.println("After sorting, myList looks like: ");

    selectionSort(myList);
    for (int i = 0; i < myList.length; i++) {
    System.out.println(myList[i] + " ");
    }
  }

  public static void selectionSort(int[] list) {
    for (int i = list.length - 1; i > 0; i--) {
    int currentMax = list[i];
    int currentMaxIndex = i;

    for (int j = 0; j < i; j++) {
      if (currentMax < list[j]) {
        currentMax = list[j];
        currentMaxIndex = j;
      }
    }

     if (currentMaxIndex != i) {
      list[currentMaxIndex] = list[i];
      list[i] = currentMax;
     }
    }
  }
}
