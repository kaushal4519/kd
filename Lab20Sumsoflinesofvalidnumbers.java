
/**
 * Write a description of class Labexercise19 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Lab20Sumsoflinesofvalidnumbers{
    public static void main(String[]args){
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter line of numbers and enter '#' to terminate the program");
        String word = key.nextLine();
        while(!word.equals("#")){
            processLine ( word );
            word = key.nextLine();
        }
    }

    public static void processLine( String word ){
        Scanner kb = new Scanner ( word );
        int num;
        int sum = 0;
        while(kb.hasNextInt()){
            num = kb.nextInt();
            sum +=num;
        }
        System.out.println(sum);
    }

}
