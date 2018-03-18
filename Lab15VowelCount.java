import java.util.Scanner;
/**
 * Write a description of class Labexercise15 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Lab15VowelCount{
    public static void main(String[]args){
        Scanner key = new Scanner(System.in);
        int counta=0,counte=0,counti=0,counto=0,countu=0;
        System.out.println("please enter word");
        String word = key.nextLine().toLowerCase();
        while(!word.equals("#")){
          input(word);
            word = key.nextLine().toLowerCase(); 
        }
    }

    public static void input(String word){
        int counta=0,counte=0,counti=0,counto=0,countu=0;
        for(int i=0;i<word.length();i++){
           
            if(word.charAt(i)== 'a' ){
                counta++;
            }
            if( word.charAt(i)=='e' ){
                counte++;
            }
            if( word.charAt(i)=='i' ){
                counti++;
            }
            if(word.charAt(i)== 'o' ){
                counto++;
            }
            if(word.charAt(i)== 'u'){
                countu++;
            }
        }
        System.out.println("a:"+ counta + "," + "e:" + counte + "," + "i:" + counti + "," + "o:" + counto + "," + "u:" + countu);
       
        System.out.println("please enter another word");
    }
}