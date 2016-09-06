public class PercentageProgram {
  public static void main(String[] args) {
  double midterm;
  double exam;
  double projects;
  double hwlabs;
  double fgrade;

  midterm = 90;
  exam = 100;
  projects = 90;
  hwlabs = 80;

  fgrade = ( midterm + exam + projects + hwlabs ) / 4;

  System.out.println("Please enter the following as a percentage...");
  System.out.println("Midterm Exam: " + midterm);
  System.out.println("Final Exam: " + exam);
  System.out.println("Projects: " + projects);
  System.out.println("Homework and Labs: " + hwlabs);
  System.out.println("Your final grade is: " + fgrade + "%");
  }
}
