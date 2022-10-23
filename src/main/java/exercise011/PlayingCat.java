package exercise011;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int minTemperature = 25;
        int maxTemperature = summer? 45: 35;

        if (temperature >= minTemperature && temperature <= maxTemperature) {
            return true;
        }
        else {
            return false;
        }
    }
}
