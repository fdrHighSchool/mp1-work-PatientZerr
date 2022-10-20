import java.util.Random;
import java.util.Scanner;

class RNG {

  public static void main(String[] args) 
  {
    int tries; // variable for # of tries
    int peoplenum;// variable for number input
    Random random1 = new Random();
    tries = 0;
    int number1 = random1.nextInt(100) + 1;
    // int number2 = 0;
    Scanner in = new Scanner(System.in);
   //----------------------------------------------------------------
    System.out.println("Im thinking of a number between 1 and 100 and i want you to guess it.");
    System.out.print("Type a number: ");
    peoplenum = in.nextInt();

    // --------------------------------------------------------
    if (peoplenum == number1) 
    {
      tries = tries + 1;
      System.out.println("You chose: " + peoplenum); // usernumber
      System.out.println("Computer chose:" + number1);// computer generated num
      System.out.println("congratulations  you FINALLY got it.");
      System.out.println("");
      System.out.println("You got it in " + tries + " tries.");
    } 
    else 
    {
      while (peoplenum != number1) 
      {
        tries = tries + 1;
        System.out.println("You chose: " + peoplenum);// usernumber
        if (peoplenum < number1) {
          System.out.println("Nope go higher try again");
          System.out.print("Type a number: ");

          peoplenum = in.nextInt();
          System.out.println("");
        }

        if (peoplenum > number1) 
        {
          System.out.println("nope go lower try again");
          System.out.print("Type a number: ");
          peoplenum = in.nextInt();
          System.out.println("");
        }

        if (peoplenum == number1)
        {
          tries = tries + 1;
          System.out.println("You chose: " + peoplenum); // usernumber
          System.out.println("Computer chose:" + number1);// computer generated num
          System.out.println("congratulations  you FINALLY got it.");
          System.out.println("");
          System.out.println("You got it in " + tries + " tries.");
          break;
        }
        
      }//end of while loop

    } // end of else loop
   in.close();
  }// public class main
 
}// end of main

// System.out.println("");