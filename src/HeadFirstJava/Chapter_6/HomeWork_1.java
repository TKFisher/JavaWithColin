package HeadFirstJava.Chapter_6;

/*  HOMEWORK:
    Create two array lists
    ArrayList<String> c1= new ArrayList<String>(); c1.add("Red"); c1.add("Green"); c1.add("Black"); c1.add("White"); c1.add("Pink");
    ArrayList<String> c2= new ArrayList<String>(); c2.add("Red"); c2.add("Green"); c2.add("Black"); c2.add("Pink");

    Create a comparison that looks at each color/element in the first list to see if it exists in the 2nd list
    Output your answer for each color to the command line
    Red from c1 is contained in c2……etc
*/

import java.util.ArrayList;

public class HomeWork_1
{

    public static void main(String[] args)
    {
        ArrayList<String> c1 = new ArrayList<String>();
        String color1 = new String("Red");
        String color2 = new String("Green");
        String color3 = new String("Black");
        String color4 = new String("White");
        String color5 = new String("Pink");

        c1.add(color1);
        c1.add(color2);
        c1.add(color3);
        c1.add(color4);
        c1.add(color5);
        System.out.println("The colors in c1 are: " + c1);


        // Strings contained in a regular String array. NOTE: This will throw
        // an index out-of-bound error if the index size does not equal the
        // ArrayList of c1, hence, this is why we used ArrayList(s) when possible.
        String[] col1 = {"Red","Green","Black","Pink","Purple"};

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add(col1[0]);
        c2.add(col1[1]);
        c2.add(col1[2]);
        c2.add(col1[3]);
        c2.add(col1[4]);
        System.out.println("The colors in c2 are: " + c2);


        // Loops through both the c1 and c2 arrays and compares the values.
        for (int i = 0; i < c1.size(); i++) {
            if (c1.contains(c2.get(i))) {
                System.out.println(c2.get(i) + " from c2 is contained in c1. ");
            } else {
                System.out.println(c2.get(i) + " does not exist in c1.");
            }
        }
    }
}
