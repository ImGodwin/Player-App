package entities;

public class App {

    protected String title;
    protected int duration;


    public App(String title, int duration) {
        this.title = title;
        this.duration = duration;
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


}