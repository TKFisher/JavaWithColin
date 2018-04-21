package HeadFirstJava.Chapter_3;


/*  Bullet Points

    Variables come in two flavors: primitive and reference.

    Variables must always be declared with a name and a type.

    A primitive variable value is the bits representing the value (5, ‘a’, true, 3.1416, etc.).

    A reference variable value is the bits representing a way to get to an object on the heap.

    A reference variable is like a remote control. Using the dot operator (.) on a reference variable is
    like pressing a button on the remote control to access a method or instance variable.

    A reference variable has a value of null when it is not referencing any object.

    An array is always an object, even if the array is declared to hold primitives.
    There is no such thing as a primitive array, only an array that holds primitives.*/

public class Dog
{

    // instance variable of String type.
    String name = "";

    public static void main(String[] args)
    {
        Dog dog1 = new Dog();
        //dog1.bark();
        //dog1.name = "Fido";
        //System.out.println(dog1.name);

        // An array of type Dog with reference variable 'myDogs'
        // that can hold 3 references.
        Dog[] myDogs = new Dog[3];

        // adding dogs to my Dog array
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        //myDogs[2] = dog1;

        myDogs[0].name = "Spot";
        myDogs[1].name = "Flo";

        System.out.println("My last dog's name is " + myDogs[1].name + ".");

        int x = 0;

        // updated the book to include a '-1'
        while (x < myDogs.length -1 ) {
            myDogs[x].bark();

            x = x + 1;
        }
    }

    // Bark method with bark action.
    public void bark()
    {
        System.out.println(name + " says, 'bark! bark!'");
    }

}
