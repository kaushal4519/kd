import java.util.Scanner;
/**
 * Write a description of class Lab6Greetmanynames here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab6Greetmanynames {

    public static void main(String[] args) {
         String name;
         
         Scanner keyboard = new Scanner(System.in);
         System.out.println("Enter your name bitch");
         System.out.println("Enter STOP to end");
         name = keyboard.next( );
         while ( ! name.equals("#)" ) ) {
                System.out.println("hi"+name);
                System.out.println("enter your name");
                name = keyboard.nextLine();}
   } //main

} // class Lab6Greetmanynames
