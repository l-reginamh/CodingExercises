package exercise024;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        else {
            int bigCountAvailable = bigCount, smallCountAvailable = smallCount;
            int bigCountUsed = 0, smallCountUsed = 0;

            int sum = goal;
            boolean donePacking = false;
            while (donePacking != true) {
                if (bigCount != bigCountUsed && (sum - 5) >= 0) {
                    bigCountUsed++;
                    sum -= 5;
                }
                else if ((smallCount != smallCountUsed) && (sum - 1) >= 0) {
                    smallCountUsed++;
                    sum -= 1;
                }
                else {
                    donePacking = true;
                }
            }
            return sum == 0;
        }
    }
}
