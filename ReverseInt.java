/**
 * ReverseInt
 */
public class ReverseInt {
    public static int reverseNum(int num) {
        int revNum = 0;
        while (num > 0) {
            revNum = revNum * 10 + num % 10;
            num /= 10;
        }
        return revNum;
    }

    public static void main(String[] args) {
        int nums[] = { 1234, 2344, 121, 566 };
        for (int i = 0; i < nums.length; i++) {
            System.out.println(reverseNum(nums[i]));
        }
        // System.out.println("Hello world!");
    }
}