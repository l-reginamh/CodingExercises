package exercise011;

public class Main {
    public static void main(String[] args) {
        /*
         * 011 - Playing Cat
         */
        System.out.println("Playing Cat");
        System.out.println(PlayingCat.isCatPlaying(true, 10));
        System.out.println(PlayingCat.isCatPlaying(false, 36));
        System.out.println(PlayingCat.isCatPlaying(false, 35));
    }
}
