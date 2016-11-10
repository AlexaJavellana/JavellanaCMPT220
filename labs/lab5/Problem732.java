/*
 * file: Problem91.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 5
 * due date: --
 * version: 1.0
 *
 * This file contains problem 7.32
 */


import java.util.Scanner;

public class Problem732 {
  public static void main (String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.println("Enter list1: ");
  int[] list1 = new int[input.nextInt()];
  for (int i = 0; i < list1.length; i++) {
    list1[i] = input.nextInt();
  }

  partition(list1);

  System.out.println("After partition, list1 looks like: ");
  for (int i = 0; i < list1.length; i++)
    System.out.print(list1[i] + " ");
  }

  public static int partition(int[] list1) {
    int initialInd = list1[0];
    int partitionInd = 0;
    int arrayLg = list1.length - 1;

    while(partitionInd < arrayLg) {

      if(initialInd > list1[partitionInd + 1]) {
        list1[partitionInd] = list1[partitionInd + 1];
        list1[partitionInd + 1] = initialInd;
        partitionInd++;
      } else {
        int temp = list1[arrayLg];
        list1[arrayLg] = list1[partitionInd + 1];
        list1[partitionInd + 1] = temp;
        arrayLg--;
      }
    }
  return partitionInd;
  }
}
