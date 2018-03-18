import java.util.Scanner;
import java.util.Collections;
/**
 * Write a description of class Lab13Reverse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab13Reverse {

    public static void main(String[] args) {
        String word, reverse;
        int len, i;
        Scanner keyboard= new Scanner(System.in);
        System.out.println("please enter a word and press # to stop the programe");
        word= keyboard.nextLine();

        while(!word.equals("#")) {

            reverse="";
            len= word.length();

            for (i= len-1; i >=0; i--) 
            {
                reverse = reverse + word.charAt(i);
            }
            System.out.println(reverse);
            System.out.println("please enter another number");
            word= keyboard.nextLine();
        } //main

    } // class Lab13Reverse
}
