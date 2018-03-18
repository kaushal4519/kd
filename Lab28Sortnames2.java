
/**
 * Write a description of class Labexercise28 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Lab28Sortnames2{
    public static void main(String[]args){
        Scanner key = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        System.out.println("Please enter the names and enter '#' to terminate the program");
        String nam = key.nextLine();
        while(!nam.equals("#")){
            names.add(nam);
            nam = key.nextLine();
        }
        input(names);
    }

    public static void input(ArrayList<String> names){
        Collections.sort(names);
        for(String nam: names){
            System.out.println(nam);
        }
    }
}