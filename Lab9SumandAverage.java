import java.util.Scanner;
/**
 * Write a description of class Lab9SumandAverage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab9SumandAverage {

    public static void main(String[] args) {
      int sum=0 , count=0 , num=0;
      
      
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("please enter a number, 999 to stop");
      
      while (num !=999) {
          count++;
          sum = sum + num;
          
          
          
          //System.out.println("enter a number");
          System.out.println(+sum);
          
          
          num = keyboard.nextInt();
        }
        count = count -1;
        System.out.println("sum: "+sum);
        System.out.println("count:" + count);
        System.out.println("average:" +sum/count);
        
               
    }
}
