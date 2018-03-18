
/**
 * Write a description of class lab37 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
public class Lab37PhoneBill {
    public static void main(String[]args) throws IOException {
        Scanner key=new Scanner(System.in);
        ArrayList<String>numbers=new ArrayList<String>();
        System.out.println("Please enter the phone number and enter '#' to terminate the program.");
        String number = key.nextLine();
        while(!number.equals("#")) {
            numbers.add(number);
            number=key.nextLine();             
        }
        for(String num:numbers){
            String result = phone(num);
            System.out.printf("%s\n",result);
        }
    } 

    public static String phone(String num) throws IOException {
        HashMap<String,String>phoneno=new HashMap<String,String>();
        Scanner kbs=new Scanner(new FileReader("phonelist.txt"));
        String no="";
        String key="";
        String space=" ";
        String output="";
        while(kbs.hasNextLine()) {
            Scanner kb = new Scanner(kbs.nextLine()).useDelimiter(" ");
            no=kb.next();
            key=kb.nextLine();
            phoneno.put(no,key);
        }
        for(String phonelists:phoneno.values()){
            if(phoneno.containsKey(num))
            {
                String name = phoneno.get(num);
                output=num+" "+name;
            }
            else
            {
                output = num +" unknown";
            }
        }
        return output;
    }
}
