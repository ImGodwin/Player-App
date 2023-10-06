package entities;

public class Images extends App {
    private int brightness;

    public Images(String title, int yearOfRelease, int brightness) {
        super(title, yearOfRelease);
        this.brightness = brightness;
    }

    public void show()
    {
        String exclamation = "*";

            System.out.print(this.title + " ");
            for(int j= 0; j<this.brightness; j++)
            {
                System.out.print(exclamation);
            }


    }

    public void readDescription(){
        System.out.println("This image is about the year 1929");
    }


    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
}
