public class Problem425 {
  public static void main (String[] args) {

  char one = (char)((int)(Math.random() * 26 + 65));
  char two = (char)((int)(Math.random() * 26 + 65));
  char three = (char)((int)(Math.random() * 26 + 65));

  int digits = (int)(Math.random() * 10000);

  System.out.println("The randomly generated plate number is "
    + one + two + three + digits);
  }
}
