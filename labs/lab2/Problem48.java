import java.util.Scanner;

public class Problem48 {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.println("Enter a ASCII code:");
  int code = input.nextInt();

  System.out.println("The character for ASCII code " + code + " is " + (char) code);
  }
}
