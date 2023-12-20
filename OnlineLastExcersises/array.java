package online;
import java.util.InputMismatchException;
import java.util.Scanner;


public class array {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int rows, cols;

    try {
        System.out.print("Number of rows: ");
        rows = scanner.nextInt();

        System.out.print("Number of columns: ");
        cols = scanner.nextInt();
    } catch (InputMismatchException e) {
        System.out.println("An exception has occurred. Please enter valid integers for dimensions.");
        scanner.close();
        return;
    }

    int[][] array = new int[rows][cols];
    int sum = 0;

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            try {
                System.out.print("el. [" + i + "][" + j + "] = ");
                array[i][j] = scanner.nextInt();
                sum += array[i][j];
            } catch (InputMismatchException e) {
                System.out.println("An exception has occurred. Please enter valid integers for array elements.");
                scanner.close();
                return;
            }
        }
    }

    double average = (double) sum / (rows * cols);

    System.out.println("The sum = " + sum);
    System.out.println("The average = " + average);

    scanner.close();
}
}
