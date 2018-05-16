package Interview;

import java.util.HashMap;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {

            if (hmap.containsKey(target - nums[i])) {
                int[] x = {hmap.get(target - nums[i]), i};
                return x;
            } else
                hmap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {

        int nums[] = {2, 5, 6, 8, 3, 4, 1, 9};
        int ans[] = twoSum(nums, 8);
        for (int i : ans)
            System.out.println(i + " : " + nums[i]);
    }
}