/*
 * file: Problem1010.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 7
 * due date: October 27 2016
 * version: 1.0
 *
 * This file contains problem 10.10
 */

public class Problem1010 {
  public static void main(String[] args) {

  QueueOfIntegers queue = new QueueOfIntegers();

    for (int i = 0; i < 20; i++) {
      queue.enqueue(i);
    }

    for (int i = 0; i < 20; i++) {
      System.out.print(" " + queue.dequeue());
    }  
  }
}
