
/**
 * Write a description of class Labexercise12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Lab12wordcount
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter thenumbers of words on each line by counting space");
        System.out.println("please enter # at the end");
        String word = key.nextLine();
        
        while (!word.equals("#"))
        {
            input(word);
            word = key.nextLine();
        }
    }
    
    public static void input(String word)
    {
        int count = 1;
        for (int i = 0; i < word.length();i++)
        {
            if (word.charAt(i) ==' ')
            {
                count++;
            }
        }
           
        if ( word.equals("") ) {
            count = 0;
        }
        System.out.println(count);
    }
}