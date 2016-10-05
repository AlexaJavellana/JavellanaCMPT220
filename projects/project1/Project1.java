/*
 * file: Project1.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: Project 1
 * due date: September 22 2016
 * version: 1.0
 *
 * This program has project 1, which calls for the convolution of two vectors
 */


import java.util.Scanner;
import java.io.*;

public class Project1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int firstV = input.nextInt();
    int secondV = input.nextInt();
    int i = 0;
    double[] vFirst = new double[firstV];
    double[] vSecond = new double[secondV];

    while (i < firstV) {
      vFirst[i] = input.nextDouble();
      i++;
    }
    i = 0;
    while (i < secondV) {
      vSecond[i] = input.nextDouble();
      i++;
    }

    double[] vThird = convolveVectors(vFirst, vSecond);
    i = 0;

    while (i < (vFirst.length + vSecond.length) - 1) {
      System.out.print(vThird[i] + " ");
      i++;
    }

  }

  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    for (int index = 0; index < (vFirst.length + vSecond.length) - 1; index++) {
      vResult[index] = 0;
      for (int shift = 0; shift < vSecond.length; shift++) {
        if((index - shift >= 0)
        && (index - shift < vFirst.length)) {
          vResult[index] += vFirst[index - shift] * vSecond[shift];
        }
      }
    }
    return vResult;
  }
}
