/* Alexa Javellana
CMPT220 */

import java.util.Scanner;

public class PercentageProgram {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the following scores (0-100)...");

    System.out.print("Midterm Exam: ");
    int midterm=input.nextInt();

    System.out.print("Final Exam: ");
    int exam = input.nextInt();

    System.out.print("Projects: ");
    int projects = input.nextInt();

    System.out.print("Homework and Labs: ");
    int hwlabs = input.nextInt();

    int fgrade;
    fgrade = (midterm * 0.2) + (exam * 0.2) + (projects * 0.2) + (hwlabs * 0.4);

    System.out.println("Your final grade is: " + fgrade + "%");
  }
}
