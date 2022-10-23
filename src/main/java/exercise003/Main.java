package exercise003;

public class Main {
    public static void main(String[] args) {
        /*
         * 003 - Barking Dog
         */
        System.out.println("Barking Dog");
        System.out.println(BarkingDog.shouldWakeUp (true, 1));
        System.out.println(BarkingDog.shouldWakeUp (false, 2));
        System.out.println(BarkingDog.shouldWakeUp (true, 8));
        System.out.println(BarkingDog.shouldWakeUp (true, -1));
    }
}
