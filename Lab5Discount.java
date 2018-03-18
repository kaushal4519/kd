import java.util.Scanner;
/**
 * Write a description of class Lab5Discount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab5Discount {

    public static void main(String[] args) {
         String item;
         int quantity;
         double price;
         
         Scanner keyboard = new Scanner(System.in);
         
         System.out.println("Please type in the item");       
         item = keyboard.next( );
                  
         
         System.out.println("Please type in the price of the item");
         price = keyboard.nextDouble( );
         
         System.out.println("Please type in the integer of the iteam");
         quantity = keyboard.nextInt( );
         
         System.out.println( );
         
         System.out.printf("%d x %s @ $%.2f",quantity,item,price);
         System.out.println( );
         
         
         if (quantity >= 10 ){
             double price2;
              
             price2 = price - (price*0.1);
             
             System.out.printf("\nSubtotal: $%.2f\n",quantity*price );
             System.out.print("-10% discount: ");
             System.out.printf("$%.2f",price*quantity*0.1);
             System.out.printf("\nTotal: $%.2f",quantity*price2);
          
                    
                            
         
            } //main
            else{
                System.out.printf("\nTotal: $%.2f",quantity*price);
            }

    } // main
} //end of lab5    
