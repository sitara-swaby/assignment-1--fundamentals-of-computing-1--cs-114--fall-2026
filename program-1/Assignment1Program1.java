import java.util.Scanner;
import java.util.Random;

public class Assignment1Program1 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("SSSSSSSSS   SSSSSSSSS");
    System.out.println("SSS         SSS");
    System.out.println("SSS         SSS");
    System.out.println("SSSSSSSSS   SSSSSSSSS");
    System.out.println("      SSS         SSS");
    System.out.println("      SSS         SSS");
    System.out.println("SSSSSSSSS   SSSSSSSSS");

    System.out.print("Please enter a 5-character string: ");
    String input = scanner.nextLine();

    String middle = input.substring(1, 4);
    String reversed = "";
    reversed = reversed + middle.charAt(2) + middle.charAt(1) + middle.charAt(0);

    System.out.print("Please enter the temperature in Fahrenheit: ");
    double fahrenheit = scanner.nextDouble();
    double celsius = (fahrenheit - 32) * 5 / 9;

    System.out.println("Random number generated. Continuing...");
    Random generator = new Random();
    int randomNumber = generator.nextInt(16353) + 32;

    System.out.println("Your new string is: " + celsius + reversed + randomNumber);
  }
}
