import java.util.Arrays;

/**
 * Twosum
 */
public class Twosum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};

    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 11, 3 };
        int res[] = twoSum(nums, 6);
        System.out.println(Arrays.toString(res));
    }
}