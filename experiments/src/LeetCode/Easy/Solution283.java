package LeetCode.Easy;

public class  Solution283 {
    /**
     * Move all zeros to the end of the array
     * Company: A
     */
    public void moveZeroes(int[] nums) {

        int pointer = 0;
        int i = 0;

        while (i < nums.length) {

            if (nums[i] != 0) {
                nums[pointer] = nums[i];
                pointer++;
            }

            i++;
        }
        while (pointer < nums.length) {
            nums[pointer] = 0;
            pointer++;
        }
    }
}
