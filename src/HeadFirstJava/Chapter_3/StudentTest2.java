package HeadFirstJava.Chapter_3;


public class StudentTest2
{
    public static void main(String[] args)
    {
        // Declare a Student array of 5 objects.
        Student2[] students = new Student2[5];

        // Instance variables
        String name[] = {"Fred", "Sally", "Timmy", "Pat", "Phil"};
        double examScore[] = {87.9, 90.0, 12.1, 75.5, 61.8};

        // creates a loop to instantiate five objects and populates the five objects.
        for (int i = 0; i < students.length; i++) {

            // Declares and instantiates a new Student2 object with the referance variable 'newStudent'
            Student2 newStudent = new Student2();
            // gives the object a name
            newStudent.name = name[i];
            // gives the object an exam score
            newStudent.examScore = examScore[i];
            // System.out.println(newStudent.name + " " + newStudent.examScore);

            // instantiates another Student object with a variable to reference the 'examScore'
            Student letter = new Student();
            System.out.println(newStudent.name + "'s score of " + newStudent.examScore + " results in a letter grade of "
                    + letter.gradeLetter(newStudent.examScore));
        }
    }

}
