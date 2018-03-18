
/**
 * Write a description of class ytyt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Arrays;
public class Lab25Sortnames1{
    public static void main(String[]args){
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter the number ");
        int number = key.nextInt();
        key.nextLine();
        System.out.println("Please enter the name");
        String [] name = new String[number];
        for(int count = 0; count<number;count++){
            name[count] = key.nextLine();
        }
        processLine(name);
     }

    public static void processLine( String name[]){
        Arrays.sort(name);
        for( String sortedname: name){
            System.out.println( sortedname );
        }
    }
}