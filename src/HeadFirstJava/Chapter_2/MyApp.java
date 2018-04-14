package HeadFirstJava.Chapter_2;

public class MyApp

{

    public static void main(String[] args)
    {

        // Exercise A
        TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.playTape();


        if (t.canRecord == true) {
            t.recordTape();

        }


        // Exercise B
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();


        if (d.canRecord == true) {
            d.recordDVD();
        }


        // Code Magnets
        DrumKit dr = new DrumKit();
        dr.snare = false;   // The book sets this to 'false' which means it will not run the playSnare method.

        if(dr.snare == true){
            dr.playSnare();
        }

        dr.playTopHat();
    }

    // BE the Compiler

    // Exercise A
    // No: Will not compile
    // The TapeDeck class is not instantiated anywhere in order for the "t" variable be usable.
    // Once done it should print out: "tape playing"  and "tape recording" on seperate lines.


    // Exercise B
    // No: Will not compile
    // There is not playDVD method created.  If created it will compile but unless a statement of some
    // is included in the method the only thing printed to the screen will be "DVD recording" from the
    // RecordDVD method.

}


