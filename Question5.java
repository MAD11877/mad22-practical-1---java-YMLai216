import java.util.Scanner;
import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    List<Integer> list=new LinkedList<Integer>();  
    Scanner in = new Scanner(System.in);
    System.out.print(""); // Input number of times to loop//
    int i = in.nextInt();
    while (i > 0) {
      Scanner un = new Scanner(System.in);
      System.out.print(""); // Input integers//
      int u = un.nextInt();
      list.add(u);
      i--;
    }
    int Value = 0;
    int MaxCount = 0;
    for (int u: list) {
      int count = 0;
       for (int n: list) {
         if (n == u) {
           count++;
         }
        }
        if (count > MaxCount) 
        {
            MaxCount = count;
            Value = u;
        }
      }
    System.out.print(Value); // Prints mode value//
    
  }
}
