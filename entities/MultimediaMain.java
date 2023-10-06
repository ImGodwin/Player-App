package entities;

import java.util.Scanner;

public class MultimediaMain {
    public static void main(String[] args)
    {



        //System.out.println(audioPlayer.increaseVolume(12));
        Scanner input = new Scanner(System.in);
        Audio audioPlayer = new Audio("Good music", 1995, 13, 8);
       // audioPlayer.readDescription();
        System.out.println(audioPlayer);

        audioPlayer.readDescription();
        int num = Integer.parseInt(input.nextLine());

        //audioPlayer.increaseVolume(num);
        App[] arr = new App[5];


        for(int i = 0; i<1; i++)
        {
            System.out.println("what do you want to create: (a: music, b: video, c: image)");
            String risp = input.nextLine();
            switch(risp){
                case "a": {
                    System.out.println("what is the title of the song?");
                    String title = input.nextLine();
                    System.out.println("what is the duration of the song?");
                    int duration = Integer.parseInt(input.nextLine());
                    System.out.println("when was the song released?");
                    int year = Integer.parseInt(input.nextLine());
                    System.out.println("What is the volume?");
                    int vol = Integer.parseInt(input.nextLine());
                    arr[i] = new Audio(title, duration, year, vol);
                    break;
                }
                case "c": {
                    System.out.println("what is the title of the image");
                    String title = input.nextLine();
                    System.out.println("what is the year of release?");
                    int year = Integer.parseInt(input.nextLine());
                    System.out.println("How bright is the image?");
                    int brightnessLevel = Integer.parseInt(input.nextLine());
                    arr[i] = new Images(title, year, brightnessLevel);
                    break;
                }
            }

        }

        /*if(arr[0] instanceof Audio)

        ((Audio) arr[0]).increaseVolume();*/

        if(arr[0] instanceof Images)

            ((Images) arr[0]).show();


        //System.out.println("add your favorite song: ");
        //audioPlayer.decreaseVol(num);
       // input.close();


    }
}
