package entities;

public class MultimediaMain {
    public static void main(String[] args) {

        Audio audioPlayer = new Audio("Billie Jean", 20, SongList.MichaelJackson, 5, 3);

        System.out.println(audioPlayer);
    }
}
