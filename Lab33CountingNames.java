 
/**
 * Write a description of class edwfcwed here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

import java.io.*;
public class Lab33CountingNames{
    public static void main(String[]args)throws IOException
    {
        Scanner key = new Scanner(System.in);
        ArrayList<String> named = new ArrayList<String>();
        System.out.println("Please enter the name and enter '#' to terminate the program");
        String name = key.nextLine();
        while(!name.equals("#")){
            named.add(name);
            System.out.println("Please enter the name and enter '#' to terminate the program");
            name = key.nextLine();
        }
        input(named);
       
    }
    
        public static void input(ArrayList<String>nam)throws IOException{
            Scanner kb = new Scanner(new FileReader("names.txt"));
            ArrayList<String>number = new ArrayList<String>();
            label:
            while(kb.hasNextLine()){
                String test=kb.nextLine();
                
                if(test.equals("#")){
                    break label;
                }
                else {
                    number.add(test);
                }
            }
            for(String count: nam){
                int counter = 0;
                for(String find:number){
                    if(count.equals(find)){
                        counter++;
                    } 
                }  
                System.out.println(count + ": " + counter);
            }
        }
    }
                
                