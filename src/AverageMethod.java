public class AverageMethod {
  public static void main(String[] args) {
    double avg = average(2, 5, 8);
    System.out.println("The average is: " + avg);
  }

  private static double average(double a, double b, double c) {
    return sum(a, b, c) / 3;
  }

  private static double sum(double a, double b, double c) {
    return a + b + c;
  }
}
