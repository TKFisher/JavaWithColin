package HeadFirstJava.Chapter_4;

public class FavoriteTune
{
    private String bandName;
    private String songName;
    private String albumName;


    public FavoriteTune(String bandName, String albumName, String songName)
    {
        this.bandName = bandName;
        this.songName = songName;
        this.albumName = albumName;
    }

    public void printFavorites()
    {

        getBandName();
        getSongName();
        getAlbumName();

        System.out.println("My favorite band is " + this.bandName + " and my favorite song is " + this.songName + " from the ablum " + this.albumName);
    }

    // Using method to set the values instead
//    public void setBandName(String bandName)
//    {
//        this.bandName = bandName;
//    }
//
//    public void setSongName(String songName)
//    {
//        this.songName = songName;
//    }
//
//    public void setAlbumName(String albumName)
//    {
//        this.albumName = albumName;
//    }


    public String getBandName()
    {
        return bandName;
    }

    public String getSongName()
    {
        return songName;
    }

    public String getAlbumName()
    {
        return albumName;
    }


    public static void main(String[] args)
    {

        FavoriteTune myBand = new FavoriteTune("CCR", "Cosmo's Factory", "'Who'll Stop the rain'");
        myBand.printFavorites();

    }
}
