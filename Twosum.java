/**
 * Twosum
 */
public class Twosum {
    public static void twoSum(int[] nums, int target) {
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < nums.length; i++) {
            int firstNum = nums[i];
            for (int j = 0; j < nums.length; j++) {
                int secondNum = nums[j];
                int _target = firstNum + secondNum;
                if (_target == target) {
                    index1 = i;
                    index2 = j;
                    break;
                }
            }
        }
        System.out.println("[" + index1 + "," + index2 + "]");

    }

    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        twoSum(nums, 17);
    }
}