import java.util.Scanner;
import java.util.Calendar;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
 
        System.out.print("Enter your year of birth: ");
        int birthYear = scanner.nextInt();

        System.out.print("Enter your height in centimeters: ");
        double heightInMeters = scanner.nextDouble();

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - birthYear;

        double heightInCentimeters = heightInMeters * 100;


        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Height: " + heightInCentimeters + " cm");

        scanner.close();
    }
}
			

