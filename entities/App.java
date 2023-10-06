package entities;

public class App {

    protected String title;
    protected int duration;
    protected int volumUp;
    protected int volumeDown;

    public App(String title, int duration, int volumUp, int volumeDown) {
        this.title = title;
        this.duration = duration;
        this.volumUp = 0;
        this.volumeDown = 0;
    }


    @Override
    public String toString() {
        return "App{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", volumUp=" + volumUp +
                ", volumeDown=" + volumeDown +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getVolumUp() {
        return volumUp;
    }

    public void setVolumUp(int volumUp) {
        this.volumUp = volumUp;
    }

    public int getVolumeDown() {
        return volumeDown;
    }

    public void setVolumeDown(int volumeDown) {
        this.volumeDown = volumeDown;
    }
}
