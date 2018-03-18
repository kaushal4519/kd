
/**
 * Write a description of class Lab3Shopping here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Lab3Shopping {

    public static void main(String[] args) {
        String item;
        double price;
        int quantity;
         Scanner keyboard = new Scanner(System.in);
         System.out.println("Please type in the iteam category");
         item = keyboard.next( );
         System.out.println("Please enter in the price of the iteam");
         price = keyboard.nextDouble( );
         System.out.println("Please enter in the integer of the iteam");
         quantity = keyboard.nextInt( );
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.printf("%d x %s @ $%f Total: $%.2f",quantity,item,price,quantity*price);
    } //main

} // class Lab3Shopping
