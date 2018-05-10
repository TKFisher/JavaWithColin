package HeadFirstJava.Chapter_2;


public class Day
{
    public void determineSuffix(int dayNum)
    {
        // Create method using if & else conditionals to
        // determine what each day’s suffix is (ie. 1st, 7th)

        if (dayNum == 1) {
            System.out.println("It's Monday, the 1st day of the week");
        } else if (dayNum == 2) {
            System.out.println("It's Tuesday, the 2nd day of the week");
        } else if (dayNum == 3) {
            System.out.println("It's Wednesday, the 3rd day of the week");
        } else if (dayNum == 4) {
            System.out.println("It's Thursday, the 4th day of the week");
        } else if (dayNum == 5) {
            System.out.println("It's Friday, the 5th day of the week");
        } else if (dayNum == 6) {
            System.out.println("It's Saturday, the 6th day of the week");
        } else if (dayNum == 7) {
            System.out.println("It's Sunday, the 7th day of the week");
        }
    }

    // For Bonus Points:   same as above but make an array to do the same things.

    public void determineSuffixTwo(int numDay)
    {
        String[] day = new String[7];

        day[0] = "Monday";
        day[1] = "Tuesday";
        day[2] = "Wednesday";
        day[3] = "Thursday";
        day[4] = "Friday";
        day[5] = "Saturday";
        day[6] = "Sunday";

        String dayOfWeek = null;
        int dayPosition = 1;

        for (int i = 0; i < day.length; i++){

            dayOfWeek = day[i];
            System.out.println("It's " + dayOfWeek + ", day " + dayPosition + " of the week.");
            dayPosition ++;
            }
    }

    public void determineSuffixThree(){

        String [] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", };

        String dayOfWeek = null;
        int dayPosition = 1;

        for (int i = 0; i < day.length; i++){

            dayOfWeek = day[i];
            System.out.println("It's " + dayOfWeek + ", day " + dayPosition + " of the week.");
            dayPosition ++;
        }

    }
}
