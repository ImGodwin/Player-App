package entities;

public class Audio extends App {

   int duration;
   int volume;

    public Audio(String title, int yearOfRelease, int duration, int volume) {
        super(title, yearOfRelease);
        this.duration = duration;
        this.volume = ;
    }

    public


    @Override
    public void readDescription() {
        System.out.println("This song was relesed in the year " + this.yearOfRelease);
    }

    @Override
    public String toString() {
        return "Audio{" +
                "duration=" + duration +
                ", volume=" + volume +
                '}';
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
