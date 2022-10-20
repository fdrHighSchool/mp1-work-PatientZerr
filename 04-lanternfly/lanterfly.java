import java.util.Scanner;
import java.io.*;
public class lanterfly {
 
  public static final String RESET = "\u001B[0m";
  public static final String RED = "\u001B[31m";
  public static final String GREEN = "\u001B[32m";
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String ans = ""; // yes or no
    int relatives = 0; // amount of relatives squash
    int sum = 0; // relatives total
    int a;
    

    // ----------------------------------------------------------------------------------

    System.out.print("The lanternfly is an invasive species and ");
    System.out.println("is a threat to our trees and plants.");

    System.out.print("How many did you squash this summer? \n");
    int num = input.nextInt();

    if (num < 10) {
      System.out.println("You can do better than that!\n");
    } // end if statement

    if (num > 10) {
      System.out.println("Thanks for doing your part!\n\n");
    } // end if statement

    System.out.println("Did anyone else in your family squash lanterflys? " + GREEN + "Yes " + RESET + "or" + RED + " No" + RESET);
    ans = input.next();

    // make code so input is in array
    // make code askes user if they want to add more relatives.

    // ----------------------------------------------------------------------------------

    // begining of if yes ****
    if (ans.equalsIgnoreCase("yes")) {

      System.out.println("How many relatives squashed lantern flys?");
      relatives = input.nextInt();

      int array[] = new int[relatives];

      System.out.println("How much did each of them squash?");

      for (int i = 0; i < array.length; i++) {
        array[i] = input.nextInt();
      }
      for (a = 0; a < array.length; a++) {
        sum += array[a];
      }
      int total = sum + num;
      System.out.println("You have squashed a total of " + total + " lantern flys!");

    } // end of if yes

    // if no ****
    if (ans.equalsIgnoreCase("no")) {
      System.out.println("Well what are you waiting for? Get squashing!");
    } // end of if no
    input.close();
  } // end main method

} // end class

// ans if yes how many people squashed (find out how many poeple squashed) how
// many did each squash and eadd them up.

// if no tell them to go squash.

// original;


