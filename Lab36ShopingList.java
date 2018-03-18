
/**
 * Write a description of class Labexercise36 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
public class Lab36ShopingList
{
    public static void main(String[]args)throws IOException
    {
        System.out.println("plese enter the items  and also the quantity and enter # to terminate");
        Scanner key = new Scanner (System.in);
        String item = key.nextLine();
        ArrayList<String>items = new ArrayList<String>();
        while(!item.equals("#"))
        {
            items.add(item);
            item = key.nextLine();
        }
        for (String nam : items)
        {
            String output = shoppingList(nam);
            System.out.printf(output);
        }
    }
    public static String shoppingList(String nam)throws IOException 
    {
        HashMap<String, Double> lists = new HashMap <String, Double>();
        Scanner kb = new Scanner(new FileReader("pricelist.txt"));
        String name = "";
        int quantity = 0;
        double total;
        double price;
        
        while (kb.hasNextLine())
        {
            Scanner kbs = new Scanner(kb.nextLine()).useDelimiter(" ");
            String key = kbs.next();
            double object = kbs.nextDouble();
            lists.put(key, object);
        }
        Scanner kbs = new Scanner(nam);
        while(kbs.hasNext())
        {
            name = kbs.next();
            quantity = kbs.nextInt();
        }
        
        if (lists.containsKey(name))
        {
            price = lists.get(name);
            total = price*quantity;
            String Name = name;
            String display =  String.format("%s %d @ $%.2f $%.2f\n", Name, quantity, price,total);
            return display;
        }
        else
        {
            String display = String.format("%s Not Available\n", name);
            return display;
        }
    }
}