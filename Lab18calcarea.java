import java.util.Scanner;                               
/**
 * Write a description of class Lab18calcarea here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab18calcarea {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter and Press # to stop this programme");
        String word= keyboard.nextLine();

        while(!word.equals("#")) {
            input(word);
            word = keyboard.nextLine();

        } //main

    }

    public static void input (String word) {
        Scanner lineScanner = new Scanner( word );
        String shape= lineScanner.next();

        if (shape.equals("S")) {
            double side = lineScanner.nextDouble();
            double area = side*side;
            System.out.println(area);

        } // class Lab18calcarea

        if (shape.equals("R")) {
            double length = lineScanner.nextDouble();
            double height = lineScanner.nextDouble();
            double area = length*height;
            System.out.println(area);
        } // class Lab18calcarea
        else if (shape.equals("T")) {
            double base = lineScanner.nextDouble();
            double height = lineScanner.nextDouble();
            double area = (base*height)/2;
            System.out.println(area); }
            else if (shape.equals("C")) {
                double radius = lineScanner.nextDouble();
                double area= (22 * radius * radius)/7;
                System.out.println(area); }
        }
    }