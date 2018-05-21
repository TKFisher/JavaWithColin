package HeadFirstJava.Chapter_4;

// Excercise  - fix the Clock class to compile and work.

public class Clock
{
    private String time;

    public void setTime(String t) {
        time = t;
    }

    public String getTime() {
        return time;
    }
}

// Test within ClockTestDrive class
class ClockTestDrive {
    public static void main(String [] args) {

        Clock c = new Clock();
        c.setTime("12:45");
        String tod = c.getTime();
        System.out.println("time: " + tod);

    }
}
