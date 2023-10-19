public class ass3String {
  public static void main(String[] args){
    String myString = "Java Developer";
    System.out.println("My string is: " + myString);

    char firstChar = myString.charAt(0);
    System.out.println("Its first character is " + firstChar);

    char lastChar = myString.charAt(myString.length() - 1);
    System.out.println("Its last character is " + lastChar);

    int stringLength = myString.length();

    char middleChar;
    int middleCharIndex;

    if(stringLength % 2 == 1){
      middleCharIndex = stringLength / 2 + 1;
      middleChar = myString.charAt(middleCharIndex - 1);
    }else{
      middleCharIndex = stringLength / 2;
      middleChar = myString.charAt(middleCharIndex);
    }

    System.out.println("The middle character is " + middleChar);

    int sumOfChars = firstChar + lastChar + middleChar;
    System.out.println("The sum of these characters is " + sumOfChars);

    char biggestChar = firstChar;
    if((int)lastChar > (int)biggestChar)
      biggestChar = lastChar;
    if((int) middleChar > (int) biggestChar)
      biggestChar = middleChar;
    
    System.out.println("The biggest character of these three is: " + biggestChar + " with code of " + (int)biggestChar);
  }
}
