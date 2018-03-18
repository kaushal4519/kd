
/**
 * Write a description of class Labexercise23 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Lab23MInMax{
    public static void main(String[]args){
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a line of number and enter '#' to Stop");
        String input = key.nextLine();
        while(!input.equals("#")){
            processLine( input );
            System.out.println("Please enter a line of number and enter '#' to Stop");
            input = key.nextLine();
        }
    }

    public static void processLine(String input ){
        Scanner kb = new Scanner(input);
        int num = kb.nextInt();
        int min = num;
        int max = num;
        while (kb.hasNextInt()){
            num = kb.nextInt();
            if(num < min){
                min=num;
            } else if(num > max){
                max=num;
            }
        }
        System.out.println("Min: " + min + " " + "Max: " + max);
    }
}