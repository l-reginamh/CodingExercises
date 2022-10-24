package exercise042;

public class Main {
    public static void main(String[] args) {
        int element = MinimumElement.readInteger();
        int[] array = MinimumElement.readElements(element);
        System.out.println("Minimum Element - " + MinimumElement.findMin(array));
    }
}
