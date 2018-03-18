
/**
 * Write a description of class lab38 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
public class Lab38Holiday
 {
    public static void main(String[]args) throws IOException
    {
        Scanner key=new Scanner(System.in);
        ArrayList<String>place=new ArrayList<String>();
        System.out.println("Please enter the distance you want to travel.");
        int distance=key.nextInt();
        System.out.println("Please enter your desired place and enter '#' to terminate.");
        String route=key.nextLine();
        while(!route.equals("#"))
        {
            place.add(route);
            route=key.nextLine();
        }
        for(String places:place){
            int result = processline(places);
            if((result<=distance) &&(result>0))
            {
                System.out.println(places+ " " +result+ "km"); 
            }
        }
    } 
    public static int processline(String places) throws IOException
    {
        HashMap<String,Integer>travelList=new HashMap<String,Integer>();
        Scanner kb=new Scanner(new FileReader("travel.txt"));
        while (kb.hasNextLine())
        {
            Scanner kbs=new Scanner(kb.nextLine()).useDelimiter(":|,|//n");
            String key=kbs.next();
            key+=":";
            key+=kbs.next();
            int data=kbs.nextInt();
            travelList.put(key, data);
        }
        ArrayList<String>plannedJourney=new ArrayList<String>();
        Scanner kbs=new Scanner(places).useDelimiter(",");
        while (kbs.hasNext())
        {
            plannedJourney.add(kbs.next());
        }
        int total=0;
        for(String var : plannedJourney)
        {
           total+=travelList.get(var); 
        }
        return total;
    }
}