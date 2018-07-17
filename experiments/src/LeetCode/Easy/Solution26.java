package LeetCode.Easy;

public class Solution26 {
    /**
     * Remove Duplicates from Sorted Array
     * */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int pointer = 0;
        int i = 1;

        while (i < nums.length) {
            if (nums[i] != nums[pointer]) {
                pointer++;
                nums[pointer] = nums[i];
            }
            i++;
        }
        return ++pointer;
    }
}
