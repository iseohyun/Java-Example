package c_Boxing;

public class D_TextToInt {
  public static void main(String[] args) {
    String num = "1234";
    System.out.println(num + 1);

    Integer i = Integer.parseInt(num);
    System.out.println(i + 1);

    System.out.println("2진수: " + Integer.toBinaryString(i));
    System.out.println("16진수: " + Integer.toHexString(i).toUpperCase());
    System.out.println("8진수: " + Integer.toOctalString(i));
    System.out.println("3진수: " + Integer.toString(i, 3));
  }
}