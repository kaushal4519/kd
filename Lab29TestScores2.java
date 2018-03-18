
/**
 * Write a description of class lab29 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Lab29TestScores2{
    public static void main(String[]args){
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter the number and enter # to terminate the program");
        String num = key.nextLine();
        while(!num.equals("#")){
            input(num);
            num = key.nextLine();
        }
    }

    public static void input(String num){
        Scanner kb = new Scanner( num ).useDelimiter(" ");
        ArrayList<Integer>numbers = new ArrayList<Integer>();
        while(kb.hasNext()){
            numbers.add(kb.nextInt());
        }
        Collections.sort(numbers);
        for (Integer nums: numbers){
            System.out.print(nums + " " );
        }
        System.out.println();
    }
}