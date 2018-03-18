import java.util.Scanner;
/**
 * Write a description of class Lab7PassFail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab7PassFail {

    public static void main(String[] args) {
         int Score = 0;
         String fail;
         String pass;
         
         Scanner keyboard = new Scanner(System.in);
         
         System.out.print("enter a number from 1 to 50");
         
         
         Score = keyboard.nextInt();
         while (Score !=100) {
             System.out.println("you entered " + Score);
             Score = keyboard.nextInt( );
            if (Score <=50) {
             System.out.println("fail");
            }//if
            else {
              System.out.println("pass");
             }//else
             
             
         
             
    } //while

   } // mian
}// end of Lab7
