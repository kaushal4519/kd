import java.util.Scanner;
/**
 * Write a description of class Lab17TotalScore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab17TotalScore {

    public static void main(String[] args) {
         Scanner keyboard= new Scanner(System.in);
         String wordline;
         
         System.out.println("please enter your surname, firstame, score and press # to stop the programme");
         wordline= keyboard.nextLine();
         
         while(!wordline.equals("#")) {
             input(wordline);
             wordline= keyboard.nextLine();
             } //main
} // class Lab17TotalScore
public static void input (String wordline) {
    Scanner kb = new Scanner(wordline).useDelimiter(",");
        String lastname = kb.next();
        String firstname = kb.next();
        int test1 = kb.nextInt();
        int test2 = kb.nextInt();
        int test3 = kb.nextInt();
        int test4 = kb.nextInt();
        int score = (test1+test2+test3+test4);
        System.out.println(firstname + " " + lastname + " " + score);
        
    }
}