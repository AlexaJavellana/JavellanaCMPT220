/* Alexa Javellana
CMPT220

(Sort three integers) Write a program that prompts
the user to enter three integers and display the
integers in non-decreasing order.*/

import java.util.Scanner;

public class Problem38 {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.println("Please enter three integers.");
  int number1 = input.nextInt();
  int number2 = input.nextInt();
  int number3 = input.nextInt();

  if((number1 <= number2) && (number1 <= number3)) {
    if(number2 <= number3) {
      System.out.println(number1 + ", " + number2 + ", " + number3);
    } else {
      System.out.println(number1 + ", " + number3 + ", " + number2);
    }
  } else if((number2 <= number1) && (number2 <= number3)) {
    if(number1 <= number3) {
      System.out.println(number2 + ", " + number1 + ", " + number3);
    } else {
      System.out.println(number2 + ", " + number3 + ", " + number1);
    }
  } else {
    if(number1 <= number2) {
      System.out.println(number3 + ", " + number1 + ", " + number2);
    } else {
      System.out.println(number3 + ", " + number2 + ", " + number1);
    }
    }
  }
}
