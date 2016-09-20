/*
 * file: Problem315.java
 * author: Alexa Javellana
 * course: CMPT 220
 * assignment: lab 2
 * due date: September 14 2016
 * version: 1.2
 *
 * This file contains problem 3.15, which asks to revisit the lottery problem
 * earlier in the chapter and instead of two digits being selected, three
 * digits will be selected and entered in the lottery.
 */

import java.util.Scanner;

public class Problem315 {
  public static void main (String[] args) {

  int lottery = (int)(Math.random() * 1000);

  Scanner input = new Scanner(System.in);
  System.out.println("Enter your lottery pick (three numbers):");
  int guess = input.nextInt();

  int lotteryNo1 = lottery / 100;
  int lotteryNo2 = (lottery / 100) / 10;
  int lotteryNo3 = lottery % 10;

  int guessNo1 = guess / 100;
  int guessNo2 = (guess / 100) / 10;
  int guessNo3 = guess % 10;

  System.out.println("The lottery number is " + lotteryNo1 + lotteryNo2 + lotteryNo3);

  if (guess == lottery)
    System.out.println("Exact match! You win $10,000");
  else if ((guessNo1 == lotteryNo1 && guessNo2 == lotteryNo3 && guessNo3 == lotteryNo2)
        || (guessNo1 == lotteryNo3 && guessNo2 == lotteryNo2 && guessNo3 == lotteryNo1)
        || (guessNo1 == lotteryNo3 && guessNo2 == lotteryNo1 && guessNo3 == lotteryNo2)
        || (guessNo1 == lotteryNo2 && guessNo2 == lotteryNo3 && guessNo3 == lotteryNo1)
        || (guessNo1 == lotteryNo2 && guessNo2 == lotteryNo1 && guessNo3 == lotteryNo3))
    System.out.println("You have matched all numbers! You win $3,000");
  else if (guessNo1 == lotteryNo1
        || guessNo1 == lotteryNo2
        || guessNo1 == lotteryNo3
        || guessNo2 == lotteryNo1
        || guessNo2 == lotteryNo2
        || guessNo2 == lotteryNo3
        || guessNo3 == lotteryNo1
        || guessNo3 == lotteryNo2
        || guessNo3 == lotteryNo3)
    System.out.println("You have matched one number! You win $1,000");
  else
    System.out.println("Sorry, no match");

  }
}
