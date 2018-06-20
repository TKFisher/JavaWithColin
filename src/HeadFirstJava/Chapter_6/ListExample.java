package HeadFirstJava.Chapter_6;

import java.util.*;
public class ListExample
{


    public static void main(String[] args)
    {

        ArrayList<String> myList = new ArrayList<String>();
        String a = new String ("whoohoo");
        myList.add(a);

        String b = new String ("Frog");
        myList.add(b);

        int theSize = myList.size();
        System.out.println("The myList array holds " + theSize + " index(s).");

        Object o = myList.get(1);
        System.out.println(o);

        myList.remove(1);
        boolean isIn = myList.contains(b);
        System.out.println("Does myList still contain - " + isIn + "?");

    }

}
