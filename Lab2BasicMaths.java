
/**
 * Write a description of class Lab2BasicMaths here.
 *
 * @author (Kaushal)
 * @version (11 jan 2018)
 */
import java.util.Scanner;
public class Lab2BasicMaths {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1;
        int num2;
        int answer;
        
        System.out.println("Please enter 2 number");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        
        answer = num1 + num2;
        System.out.printf("\n%d + %d = %d",num1,num2,answer);
 
        answer = num1 - num2;
        System.out.printf("\n%d - %d = %d",num1,num2,answer);

        answer = num1 * num2;                
        System.out.printf("\n%d * %d = %d",num1,num2,answer);
        
    } //main

} // class Lab2BasicMaths
