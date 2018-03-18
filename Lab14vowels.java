import java.util.Scanner;
/**
 * Write a description of class Lab14vowels here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab14vowels {

    public static void main(String[] args) {
         Scanner keyboard= new Scanner(System.in);
         
         String word;
         System.out.println("please eneter a word and press # to stop this programe");
         
         word= keyboard.nextLine();
         
         while(!word.equals("#")) {
             input(word);             
             word= keyboard.nextLine();
    } 

} // class Lab14vowels

public static void input (String word) {
         int count= 0;
         
         for(int i=0;i<word.length();i++) {
             
             if(word.charAt(i)== 'a' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u')
             {
                 count++;
                }
            }
            System.out.println(count);
            System.out.println("please eneter another  word ");
        }
    }
