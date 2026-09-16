import java.util.Scanner;

public class Assignment1Program2 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Base Conversion Program");
    System.out.println();

    System.out.print("Please enter a base (2 - 9): ");
    int base = scanner.nextInt();

    int maxNumber =
        (base - 1) * base * base * base +
        (base - 1) * base * base +
        (base - 1) * base +
        (base - 1);

    System.out.println("The maximum, 4-digit, base 10 number in base "+ base + " is " + maxNumber + ".");
    System.out.print("Now, enter a base 10 number in the range 0 to "+ maxNumber + " to convert: ");
    int number = scanner.nextInt();

    int first = number / (base * base * base);
    int remainder = number % (base * base * base);

    int second = remainder / (base * base);
    remainder = remainder % (base * base);

    int third = remainder / base;
    int fourth = remainder % base;

    System.out.println();
    System.out.println(number + " (base 10) = "+ first + second + third + fourth + " (base " + base + ")");
  }
}

