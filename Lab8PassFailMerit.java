import java.util.Scanner;
/**
 * Write a description of class Lab8PassFailMerit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab8PassFailMerit {

    public static void main(String[] args) {
        int Score;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("enter a number from 0 to 100 ");

        Score = keyboard.nextInt();
        while (Score != -1) {

            if (Score < 50) {
                System.out.println("fail");
            }//if
            else if (Score < 80)
                System.out.println("pass");
            else 
                System.out.println("merit");  
        }//else
        Score = keyboard.nextInt( );

             
    } //while
} //main


