package IDeserve;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NextGreatest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        List<Integer> list = new ArrayList<>();

        while (num != 0) {
            list.add(num % 10);
            num = num / 10;
        }


        Integer[] nums = list.toArray(new Integer[0]);
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    private static void reverse(Integer[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private static void swap(Integer[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}