
/**
 * Write a description of class Labexercise34 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;
public class Labexercise34{
    public static void main(String[]args) throws IOException 
    {
        Scanner key = new Scanner(System.in);
        ArrayList<String> nam = new ArrayList<String>();
        System.out.println("Please enter the name and enter'#' to terminate the program");
        String name = key.nextLine();
        while(!name.equals("#")){
            nam.add(name);
            name = key.nextLine();
        }
        for(String check: nam){
            int position;
            position = (getposition(check));
            if(position==-1){
                System.out.println(check + ": NOT FOUND");
            }
            else {
                System.out.println(check + ": " + position);
            }
        }
    }

    public static int getposition(String check)throws IOException{
        Scanner kb = new Scanner(new FileReader("names.txt"));
        ArrayList<String>named = new ArrayList<String>();
        while(kb.hasNextLine()){
            String test = kb.nextLine();
            if(test.equals("#")){
                break;
            }
            else 
            {
                named.add(test);
            }
        }
        int pos;
        pos=named.indexOf(check);
        return pos;
    }
}

            