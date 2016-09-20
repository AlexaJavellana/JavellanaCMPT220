/* Alexa Javellana
CMPT220 */
// == the header has a specific format

import java.util.Scanner;

public class Problem26 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // == the following lines are incorrectly indented
      System.out.println("Enter a number between 0 and 1000 :");
      int number = input.nextInt();

      int ones = number % 10;
      int tens = (number / 10) % 10 ;
      int hundreds = (number / 100) % 10;

      int sum = ones + tens + hundreds;

      System.out.println("The sum of the digits is " + sum);
  }
}
