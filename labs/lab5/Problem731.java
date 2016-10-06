/*
 * file: Problem720.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 5
 * due date: October 6, 2016
 * version: 1.2
 *
 * This file contains problem 7.31, which asks to make a program that takes
 * two random arrays, merges them and sorts them in ascending order.
 */


import java.util.Scanner;

public class Problem731 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("The entered lists must be sorted. The first value" +
                      " will not be part of the list, and only indicates" +
                      " how many values will be in the list");

    System.out.println("Enter list1: ");
    int[] list1 = new int[input.nextInt()];
    for (int i = 0; i < list1.length; i++) {
    list1[i] = input.nextInt();
    }

    System.out.println("Enter list2: ");
    int[] list2 = new int[input.nextInt()];
    for (int i = 0; i < list2.length; i++) {
      list2[i] = input.nextInt();
    }

    int[] list3 = merge(list1, list2);

    System.out.println("The merged list is ");
    for (int i = 0; i < list3.length; i++) {
      System.out.print(list3[i] + " ");
    }
  }

  public static int[] merge(int[] list1, int[] list2) {
    int[] list3 = new int[list1.length + list2.length];

    int m = 0;
    int n = 0;
    for (int i = 0; i < list3.length; i++) {
      if (n < list2.length && list1[m] > list2[n] ) {
        list3[i] = list2[n];
        n++;
      } else if (m < list1.length) {
        list3[i] = list1[m];
        m++;
      }
    }
    return list3;
  }
}
