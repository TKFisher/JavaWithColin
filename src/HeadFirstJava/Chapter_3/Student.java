package HeadFirstJava.Chapter_3;

public class Student
{

    String name = null;
    double examScore = 0;

    public String gradeLetter(double examScore)
    {
        String letterGrade;

        if (examScore < 59) {
            letterGrade = "F";

        } else if (examScore < 69) {
            letterGrade = "D";

        } else if (examScore < 79) {
            letterGrade = "C";

        } else if (examScore < 89) {
            letterGrade = "B";

        } else {
            letterGrade = "A";

        }
        return letterGrade;
    }
}


