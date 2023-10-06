package entities;

import java.util.Scanner;

import static java.lang.System.in;

public class Audio extends App {

   int duration;
   int volume;

    public Audio(String title, int yearOfRelease, String s, int volume) {
        super(title, yearOfRelease);
    }

    public Audio(String title, int yearOfRelease, int duration, int volume) {
        this(title, yearOfRelease, String.valueOf(duration), volume);
        this.duration = duration;
        this.volume = volume;
    }

    public void play()
    {

        String exclamation = "!";
        for (int i = 0; i<=this.duration; i++)
        {
            System.out.print(this.title + " ");
            for(int j= 0; j<this.volume; j++)
            {
                System.out.print(exclamation);
            }

        }

    }

    public int decreaseVol(int volDown)
    {
        String exclamation = "!";
        for(int i = volDown; i>0; i--)
        {
            for(int j= i; j>0; j--){
                System.out.println(this.title + exclamation);
            }
        }return volDown;
    }

    @Override
    public void readDescription() {
        System.out.println("This song was released in the year " + this.yearOfRelease);
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
