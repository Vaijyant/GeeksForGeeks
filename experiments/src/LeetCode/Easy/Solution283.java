package LeetCode.Easy;

public class Solution283 {
    /**
     * Move all zeros to the end of the array
     * Company: A
     * */
    public void moveZeroes(int[] nums) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }

        while (k < nums.length) {
            nums[k] = 0;
            k++;
        }
    }
}
