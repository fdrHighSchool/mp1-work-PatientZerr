
/**
 * Write a description of class date_format_9_28_22 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class date_format_9_28_22
{
    public static void main (String[] args){
    Scanner S = new Scanner(System.in);
    
    System.out.println("What day of the week is it.");
    String day= S.nextLine();
    
    System.out.println("What month is it.");
    String month= S.nextLine();
    
    System.out.println("What year is it.");
    String year= S.nextLine();
    
    System.out.println("What day is it.");
    String date= S.nextLine();
    
    System.out.println("American format: " + day + ", " + month + " " + date +  ", " + year);
    System.out.println("European format: " + day + " " + date + " " + month + " " + year);
    
    S.close();
  
    }//end of main method
}//end of date class
