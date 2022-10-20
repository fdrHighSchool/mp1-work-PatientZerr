
/**
 * Write a description of class rocketship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rocketship{

    public static void main (String[]arg){
        cone();
        horizontal();
        box();
        horizontal();
        box();
        horizontal();
        box();
        horizontal();
        cone();
    }//main
        
        public static void cone() {
            System.out.println("   /\\    ");
            System.out.println("  /  \\   ");
            System.out.println(" /    \\  ");
         }//cone
        
        public static void horizontal(){
            System.out.println("+------+");
        }//horizontal
          
        public static void box(){
            System.out.print("|");
            System.out.print("      ");
            System.out.println("|");
            System.out.print("|");
            System.out.print("      ");
            System.out.println("|");
        }//vertical
        
        public static void words(){
            System.out.print("|");
            System.out.print("      ");
            System.out.println("|");
             System.out.print("|");
            System.out.print("      ");
            System.out.println("|");
        }

        
      
}
