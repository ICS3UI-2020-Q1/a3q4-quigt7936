import java.util.Scanner;
/**
 * This program ask the user for a number and tells it in written form
 * @author Thomas Quigley
 */
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Get the number from the user 
    System.out.println("Please enter a positive integer:");
    // tell the user their number in written form, or if its not in the range of 1-10 then tell them it is not in the range
    int userNumber = input.nextInt();
    switch (userNumber) {
      case 1:
        System.out.println("one");
        break;
      case 2:
        System.out.println("two");
        break;
      case 3:
        System.out.println("three");
        break;
      case 4:
        System.out.println("four");
        break;
      case 5:
        System.out.println("five");
        break;
      case 6:
        System.out.println("six");
        break;
      case 7:
        System.out.println("seven");
        break;
      case 8:
        System.out.println("eight");
        break;
      case 9:
        System.out.println("nine");
        break;
      case 10:
        System.out.println("ten");
        break;
      default:
        System.out.println("not in the range");
        break;
    }
  }
}
