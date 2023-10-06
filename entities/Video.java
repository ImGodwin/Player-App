package entities;

public class Video extends App{

    private int brightness;
    private int duration;
    private int volume;

    public Video(String title, int yearOfRelease, int brightness, int volume, int duration) {
        super(title, yearOfRelease);
        this.brightness = brightness;
        this.volume = volume;
        this.duration = duration;
    }

    public void playVid()
    {
        for (int i = 0; i<this.duration; i++){

            System.out.print(this.title);
            for (int j = 0; j<this.volume; j++){
                System.out.print("!");
            }
            for (int k = 0; k<this.brightness; k++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public void readDescription()
    {
        System.out.print("You need to read more about this on our website");
    }

    @Override
    public String toString() {
        return "Video{" +
                "brightness=" + brightness +
                ", volume=" + volume +
                '}';
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
