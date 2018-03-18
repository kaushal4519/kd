import java.util.Scanner;
/**
 * Write a description of class Lab11Starcount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab11Starcount {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter the star word and enter'#' to stop the program");
        String word = key.nextLine();
        while(!word.equals("#")){
            countStars(word);
            System.out.println("Please enter the another word ");
            word = key.nextLine();
        } 
    }//main

    public static void countStars(String inputWord) {
        int count = 0;
        for (int i=0;i<inputWord.length();i++){
            if(inputWord.charAt(i)==('*')){
                count++;
            }
        }
        System.out.println(count);
    } //coutnStars

} // class Lab11Starcount

