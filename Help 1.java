/* Lesson 7 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L7_Activity_Two{
  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter 2 Strings:");
    
    String word1 = scan.nextLine(), word2 = scan.nextLine();
    
    if (word1.equals(word2)) System.out.println("Great!");
    else if (word1.length() == word2.length() && word1.substring(0 , word1.length -1).equal(word2.substring(0, word2.length - 1))) System.out.println("Close Enough");
    else System.out.println("Try again");
  }
}
