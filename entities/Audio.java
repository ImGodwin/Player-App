package entities;

public class Audio extends App {

    private SongList song;
    private int increaseVolume;
    private int decreaseVolume;

    public Audio(String title, int duration) {
        super(title, duration);
        this.song = song;

    }

    public Audio(String title, int duration, SongList song, int increaseVolume, int decreaseVolume) {
        super(title, duration);
        this.song = song;
        this.increaseVolume = increaseVolume;
        this.decreaseVolume = decreaseVolume;
    }

    public void chooseSong()
    {
    switch (this.song){
        case BackStreet -> System.out.println("you are listening to: " + SongList.BackStreet);
        case B2K -> System.out.println("you are listening to: " + SongList.B2K);
        case Westlife -> System.out.println("you are listening to: " + SongList.Westlife);
        case MichaelJackson -> System.out.println("you are listening to: " + SongList.MichaelJackson);
        case LutherVandross -> System.out.println("you are listening to: " + SongList.LutherVandross);
    }

    }

    public void increaseVolume(int vol, SongList song)
    {
        String exclamation = "!";
        for(int i = 1; i<=vol; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.println(song + exclamation);
            }
            System.out.println(" ");
        }
    }


    @Override
    public String toString() {
        return "Audio{" +
                "song=" + song +
                ", increaseVolume=" + increaseVolume +
                ", decreaseVolume=" + decreaseVolume +
                '}';
    }

    public SongList getSong() {
        return song;
    }

    public void setSong(SongList song) {
        this.song = song;
    }

    public int getIncreaseVolume() {
        return increaseVolume;
    }

    public void setIncreaseVolume(int increaseVolume) {
        this.increaseVolume = increaseVolume;
    }

    public int getDecreaseVolume() {
        return decreaseVolume;
    }

    public void setDecreaseVolume(int decreaseVolume) {
        this.decreaseVolume = decreaseVolume;
    }
}
