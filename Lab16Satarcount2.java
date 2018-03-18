
/**
 * Write a description of class Labexercise16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Lab16Satarcount2{
    public static void main(String[]args){
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter the star word and enter '#' to terminate the program");
        String word = key.nextLine();
        while(!word.equals("#")){
            input(word);
            word = key.nextLine(); 
        }
    }

    public static void input(String word){        
        int count = 0;
        for (int i=0;i<word.length();i++){
            if(word.charAt(i)==('*')){
                count++;
            }
            else
            if(word.charAt(i)==('!')){
                break;
            }
        }
        System.out.println(count);

    }
}

        