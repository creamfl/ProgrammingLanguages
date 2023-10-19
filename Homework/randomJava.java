
import java.security.SecureRandom;

public class randomJava {
  public static void main(String[] args){
    SecureRandom generator = new SecureRandom();

    int upperBound = 100;

    double doubleRandom = generator.nextDouble() * upperBound;
    System.out.println("From 0 to 100, the computer picked: " + doubleRandom);

    int intPart = (int)doubleRandom;
    System.out.println("Integer part of this number is: " + intPart);

    double decimalPart = doubleRandom - intPart;
    System.out.println("Decimal part of this number is: " + decimalPart);

    char charPart = (char)intPart;
    System.out.println("Character with code " + intPart + " is: " + charPart);

  }
}
