
/**
 * Write a description of class Labexercise32 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;
public class Lab32Fileprocessing{
    public static void main(String[]args)throws IOException
    {
        Scanner key = new Scanner(new FileReader("Y:\\QTN\\ITC502\\raw.txt"));
        ArrayList<String> name = new ArrayList<String>();
        while(key.hasNextLine()){
            name.add(key.nextLine());
        }
        for(String nam: name){
            input(nam);
        }
    }
    
    public static void input(String nam){
        Scanner kb = new Scanner(nam).useDelimiter(" ");
        String names = kb.next();
        ArrayList<Integer>nam1 = new ArrayList<Integer>();
        while(kb.hasNextInt()){
            nam1.add(kb.nextInt());
        }
        Collections.sort(nam1);
        int num = nam1.size();
        int num1 = nam1.get((num-1));
        int num2 = nam1.get((num-2));
        int num3 =nam1.get((num-3));
        System.out.println(names+ " " +num1+ " "+num2+ " " +num3);
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        