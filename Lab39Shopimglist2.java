
/**
 * Write a description of class lab39 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
public class Lab39Shopimglist2{
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter items and quantity and enter '#' to terminate the program.");
        ArrayList<String>item=new ArrayList<String>();
        Scanner key=new Scanner(System.in);
        String input=key.nextLine();
        while(!input.equals("#"))
        {
            item.add(input);
            input=key.nextLine();
        }
        for(String each:item)
        {
            double result=processLine(each);
            System.out.printf("$%.2f\n",result);
        }
    } 

    public static double processLine (String item) throws IOException
    {
        HashMap<String,Double>shoppingList=new HashMap<String,Double>();
        Scanner kb=new Scanner(new FileReader("pricelist.txt"));
        while(kb.hasNextLine())
        {
            Scanner kbs=new Scanner(kb.nextLine());
            String itemd=kbs.next();
            double Price=kbs.nextDouble();
            shoppingList.put(itemd,Price);
        }
        Scanner kbs = new Scanner(item);
        double total=0;
        while(kbs.hasNext())
        {
            String items=kbs.next();
            int quantity=kbs.nextInt();
            double eachPrice=shoppingList.get(items);
            total+=(quantity*eachPrice);
        } 
        return total;
    }
} 



