/**
 * ReverseInt
 */
public class ReverseInt {
    public static int reverseNum(int x) {
        int revInt = 0;
        if (revInt > Integer.MAX_VALUE / 10 || revInt < Integer.MIN_VALUE / 10) {
            return 0;
        }
        while (Math.abs(x) > 0) {
            revInt = revInt * 10 + x % 10;
            x /= 10;
        }
        return revInt;
    }

    public static void main(String[] args) {
        int nums[] = { 1234, -2344, 121, 566 };
        for (int i = 0; i < nums.length; i++) {
            System.out.println(reverseNum(nums[i]));
        }
        // System.out.println("Hello world!");
    }
}