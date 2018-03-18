
/**
 * Write a description of class lab40 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Lab40CSVfile{
    public static void main(String[]args) {
        System.out.println("Please enter input and enter # to terminate.");
        Scanner key=new Scanner(System.in);
        ArrayList<String>word=new ArrayList<String>();
        String name=key.nextLine();
        while(!name.equals("#")){
            word.add(name);
            name=key.nextLine();
        }
        for(String nam:word){
            String result=processlines(nam);
            System.out.println(result);
        }
    }

    public static String processlines(String nam){
        ArrayList<String>Files=new ArrayList<String>();
        Scanner kb=new Scanner(nam).useDelimiter("");
        while(kb.hasNext()){
            Files.add(kb.next());   
        }
        boolean dscn=false;
        String newword="";
        for (String chars:Files){
            if(dscn==false && chars.equals("\"")){
                dscn=true; newword+="\"";
            }else if(dscn==true&&chars.equals("\"")){               
                dscn=false; newword+="\"";
            }else if (chars.equals(",")) {
                if (dscn==true&&chars.equals(",")){
                    newword+=",";
                }
                else
                {
                    newword+=";";
                }
            }
            else
            {
                newword+=chars;
            }
        }
        return newword;
    }
}