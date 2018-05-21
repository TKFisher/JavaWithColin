package HeadFirstJava.Chapter_3;

public class StudentTest
{
    public static void main(String[] args)
    {

        Student[] students = new Student[5];

        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();
        students[3] = new Student();
        students[4] = new Student();

        students[0].name = "Fred";
        students[0].examScore = 87.9;
        students[1].name = "Sally";
        students[1].examScore = 90.0;
        students[2].name = "Timmy";
        students[2].examScore = 12.1;
        students[3].name = "Pat";
        students[3].examScore = 75.5;
        students[4].name = "Phil";
        students[4].examScore = 61.8;

        // Instantiate another Student object that references 'letter'
        Student letter = new Student();

        for (int i = 0; i <= students.length - 1; i++) {

            System.out.println(students[i].name + "'s score of " + students[i].examScore +
                    " results in a letter grade of " + letter.gradeLetter(students[i].examScore));
        }
    }
}
