package exercise024;

public class Main {
    public static void main(String[] args) {
        /*
         * 024 - Flour Packer
         */
        System.out.println("Flour Packer");
        System.out.println(FlourPacker.canPack (1, 0, 4));
        System.out.println(FlourPacker.canPack (1, 0, 5));
        System.out.println(FlourPacker.canPack (0, 5, 4));
        System.out.println(FlourPacker.canPack (2, 2, 11));
        System.out.println(FlourPacker.canPack (-3, 2, 12));
    }
}
