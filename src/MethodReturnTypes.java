public class MethodReturnTypes {
  public static void main(String[] args) {
    System.out.println(getString());
    System.out.println(getInt());
    System.out.println(getBoolean());
  }

  private static String getString() {
    return "String of text";
  }

  private static int getInt() {
    return 5;
  }

  private static boolean getBoolean() {
    return false;
  }
}
