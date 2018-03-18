
/**
 * Write a description of class l30 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Lab30StanderedDeviation{
    public static void main (String[]args){
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter the numbers");
        String num = key.nextLine();
        while(!num.equals("#")){
            System.out.printf("%.3f",sdevation(num));
            System.out.println("\nPlease enter the numbers");
            num = key.nextLine();
        }
    }
    public static double sdevation(String num){
        Scanner kb = new Scanner(num);
        double sum = 0.0,numd=0.0,num1 = 0.0, s = 0.0,mean=0.0;
        int count=0;
        while(kb.hasNextDouble()){
            numd = kb.nextDouble();
            sum+=numd;
            count ++;
            mean = sum/count;
            num1 +=Math.pow(numd,2);
            s=Math.sqrt((num1-count*mean*mean)/(count-1));
        }
        return s;
    }
}
            
