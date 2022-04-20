import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter your integer: ");
    int input = in.nextInt();
    int value = (input * input);
    System.out.println("Your result is: " + value);
  }
}
