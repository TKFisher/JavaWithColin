package HeadFirstJava.Chapter_3;

public class BooksTestDrive
{


    public static void main(String[] args)
    {



        // < =  Declare a Book array variable 'myBooks'.
        // > =  Create a Book array and assign it to the declared Book variable.
        Books[] myBooks = new Books[3];

        // What’s missing?
        // Books! We have an array of Book references, but no actual Book objects!
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        // Give each element in the Book array an string value.
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        int x = 0;

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);

            x = x + 1;
        }
    }
}
