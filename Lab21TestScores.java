
/**
 * Write a description of class Labexercise21 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Lab21TestScores{
    public static void main(String[]args){
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter line of numbers and enter '#' to stop the program");
        String word = key.nextLine();
        while(!word.equals("#")){
            processLine ( word );
            word = key.nextLine();
        }
    }

    public static void processLine( String word ){
        Scanner kb = new Scanner ( word ).useDelimiter(",");
        int sum = 0;
        String name1 = kb.next();
        String name2 = kb.next();
        while(kb.hasNextInt()){
            int num = kb.nextInt();
            sum +=num;
        } 
        System.out.println(name2 + " " + name1 + " " + sum);
    }

}

