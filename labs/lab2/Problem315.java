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
  System.out.println("Enter your lottery pick (three digits):");
  int guess = input.nextInt();

  int lotteryDigit1 = lottery / 100;
  int lotteryDigit2 = (lottery / 100) / 10;
  int lotteryDigit3 = lottery % 10;

  int guessDigit1 = guess / 100;
  int guessDigit2 = (guess / 100) / 10;
  int guessDigit3 = guess % 10;

  System.out.println("The lottery number is " + lottery);

  if (guess == lottery)
    System.out.println("Exact match! You win $10,000");
  else if ((guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2)
        || (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1)
        || (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2)
        || (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1)
        || (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3))
    System.out.println("You have matched all digits! You win $3,000");
  else if (guessDigit1 == lotteryDigit1
        || guessDigit1 == lotteryDigit2
        || guessDigit1 == lotteryDigit3
        || guessDigit2 == lotteryDigit1
        || guessDigit2 == lotteryDigit2
        || guessDigit2 == lotteryDigit3
        || guessDigit3 == lotteryDigit1
        || guessDigit3 == lotteryDigit2
        || guessDigit3 == lotteryDigit3)
    System.out.println("You have matched one digit! You win $1,000");
  else
    System.out.println("Sorry, no match");

  }
}
