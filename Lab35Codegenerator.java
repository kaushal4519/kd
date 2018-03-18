
import java.util.*;
import java.io.*;
public class Lab35Codegenerator{
    public static void main(String[] args)throws IOException {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter word and enter '#' to terminate the program");
        ArrayList<String> words = new ArrayList<String>();
        String word  = key.nextLine();
        while(!word.equals("#"))
        {
            words.add(word);
            word = key.nextLine();
        }
        for(String input : words)
        {
            String name = translate(input);
            System.out.println(name +" ");
        }
    }

    public static String translate(String word)throws IOException {
        HashMap<String, String> morse = new HashMap <String, String>();
        Scanner kb = new Scanner(new FileReader("morse.txt"));
        while(kb.hasNextLine()){
            Scanner kbs = new Scanner (kb.nextLine()).useDelimiter(" ");
            String nam  = kbs.next();
            String namd = kbs.next();
            morse.put(nam, namd);
        }
        String space = "   ";
        String Convert = "";
        ArrayList<String>arr = new ArrayList<String>();
        Scanner kbs  = new Scanner (word).useDelimiter("");
        while (kbs.hasNext()){        
            arr.add(kbs.next());
        }
        for (String named : arr){
            if(named .equals(" ")){
                Convert += space;
            }
            else
            {
                String ss = morse.get(named.toUpperCase());
                Convert += ss+" ";
            }
        }
        return Convert;
    }
}