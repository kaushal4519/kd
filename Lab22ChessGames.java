
/**
 * Write a description of class Labexercise22 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Lab22ChessGames{
    public static void main(String[]args){
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter line of words and enter '#' to Stop the program");
        String word = key.nextLine();
        while(!word.equals("#")){
            processLine ( word );
            System.out.println("Please enter names and numbers");
            word = key.nextLine();
        }
    }

    public static void processLine( String word ){
        Scanner kb = new Scanner ( word );
        int countA=0;
        int countB=0;
        for (int i = 0; i<word.length(); i++){
            if (word.charAt(i) == 'A' ){
                countA++;
            } else if(word.charAt(i) == 'B'){
                countB++;
            } 
        }
        System.out.println("A " + countA +  " B " + countB);   
    }

}