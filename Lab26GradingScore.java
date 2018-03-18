
/**
 * Write a description of class Labexercise26 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Lab26GradingScore{
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number and enter '-1' to terminate");
        double num = keyboard.nextDouble();
        ArrayList<Double>input = new ArrayList<Double>();
        while(num!=-1){
            input.add(num);
            num = keyboard.nextDouble();
        }
        processLine(input);
    }

    public static void processLine(ArrayList<Double>input){
        double nums = input.size();
        double sum = 0;
        for(double number:input){
            sum+=number;
        }
        double average = sum/nums;
        System.out.printf("Average Score = %.2f\n",average);
        for (double number : input){
            if(number>average){
                System.out.printf("%.2f ABOVE AVERAGE\n",number);
            }
            else if(number<average){
                System.out.printf("%.2f BELOW AVERAGE\n",number);
            }
            else if(number==average){
                System.out.printf("%.2f AVERAGE\n",number);
            }
        }
    }
}
