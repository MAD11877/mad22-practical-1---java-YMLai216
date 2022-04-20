import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter your integer: ");
    int i = in.nextInt();
    while (i > 0) {
      int u = i;
        while (u > 0) {
          System.out.print("*");
          u--;
        }
      System.out.println("");
      i--;
    }
  }
}
