import java.util.Scanner;
/**
 * Write a description of class Lab10TimesTablw here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab10TimesTablw {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 
        int no ;
        System.out.println("enter the number : ");
        no = keyboard.nextInt();
        
        for (int i = 1; i<=10; i++){
        
          System.out.format("%d times  %2d = %3d\n",no,i,i*no);

        
        }//for
}//main
} // class Lab10TimesTablw
