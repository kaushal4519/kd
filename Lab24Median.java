

/**
 * Write a description of class Labexercise24 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Arrays;
public class Lab24Median{
    public static void main(String[]args){
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a number and enter '#' to end");
        String word = key.nextLine();
        while(!word.equals("#")){
            processLine ( word );
            System.out.println("Please enter a number and enter '#' to end");
            word = key.nextLine();
        }
    }

    public static void processLine ( String word ){
        Scanner kb = new Scanner( word );
        int size = kb.nextInt();
        int[]num = new int [size];
        int i;
        double answer;
        for(i = 0; i<size;i++){
            num[i]=kb.nextInt();

        }
        Arrays.sort(num);
        if(size%2==1){
            answer=num[size/2];
        } else {
            answer = ( num[(size/2)-1] + num[size/2] )  /2d;
        }
        System.out.printf("%.2f\n",answer); 
        
    }
}