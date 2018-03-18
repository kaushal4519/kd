
/**
 * Write a description of class iubgb here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Lab27Sortnums{
    public static void main(String[]args){
        Scanner key = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Please enter the number and enter '#' to terminate the program");
        int num = key.nextInt();
        while(num!=-1){
            number.add(num);
            num = key.nextInt();
        }
        input(number);
    }

    public static void input(ArrayList<Integer> number){
        Collections.sort(number);
        for ( Integer nums : number ){
            System.out.println(nums);
        }
    }
}
