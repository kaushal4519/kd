import java.util.Scanner;
/**
 * Write a description of class Lab4 here.
 *
 * @author (kaushal)
 * @version (15 jan 2018)
 */
public class Lab4formalName {

    public static void main(String[] args) {
       String fullname;
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Please enter your fullname and get this shit done");
       fullname = keyboard.nextLine( );
       System.out.println( );
       System.out.println( );
       System.out.println( );
      
       
       System.out.print("found index of comma : ");
       System.out.println(fullname.indexOf(','));
       int posComma = fullname.indexOf(',');
       
       System.out.print("found index of space : ");
       System.out.println(fullname.indexOf(' '));
       int posSpace = fullname.indexOf(' ');
       
       String lastName = fullname.substring(0,posComma);
       String firstName =  fullname.substring(posComma+1);
       
       
       System.out.println(firstName + " " + lastName);
       
       
    } //main

} // class Lab4
