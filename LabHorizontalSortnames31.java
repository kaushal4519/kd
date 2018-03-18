
/**
 * Write a description of class Labexercise31 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class LabHorizontalSortnames31{
    public static void main(String[]args){
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter the names and enter '#' to terminate the program");
        String names = key.nextLine();
        while(!names.equals("#")){
            input(names);
            names = key.nextLine();
        }
    }

    public static void input(String names){
        Scanner kb = new Scanner(names).useDelimiter(",");
        ArrayList<String>nam = new ArrayList<String>();
        while(kb.hasNext()){
            nam.add(kb.next());
        }
        Collections.sort(nam);
        String namd=String.join(",",nam);
        System.out.print(namd);        
        
        System.out.println();
    }
}