/* Alexa Javellana
CMPT220 */ 
// == the header has a specific format

import java.util.Scanner;

public class Problem21 {
  public static void main(String[] args) {
    // == the following line is incorrectly indented
  Scanner input = new Scanner(System.in);

    System.out.print("Enter degrees in celsius to convert into farenheit. ");
    double celsius = input.nextDouble();

    double farenheit; // Declares farenheit

    farenheit = (9.0 / 5.0) * celsius + 32;

    System.out.println("The degree in fareneheit for " + celsius + " degrees celsius is "
      + farenheit + " degrees.");
  }
}
