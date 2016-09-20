/* Alexa Javellana
CMPT220 */ 
// == the header has a specific format

import java.util.Scanner;

public class Problem25Scanner {
  public static void main(String[] args) {
    // == the following line is incorrectly indented
  Scanner input = new Scanner(System.in);

    System.out.println("Enter the price (in whole numbers) and gratuity rate (in decimals).");
    double price = input.nextDouble();
    double rate = input.nextDouble();

    double gratuity; // Declares gratuity outcome
    double total; // Declares total price after gratuity and price is combined

    gratuity = price * rate;
    total = gratuity + price;

    System.out.println();
    System.out.println("The gratuity is " + gratuity + " and the total is " + total);
    System.out.println();
  }
}
