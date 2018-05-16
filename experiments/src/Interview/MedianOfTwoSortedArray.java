package Interview;

public class MedianOfTwoSortedArray {


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] arr = new int[m + n];

        int m1 = m - 1;
        int n1 = n - 1;

        for (int i = m + n - 1; i >= 0; i--) {
            int num;
            if (n1 == -1 || (m1 >= 0 && nums1[m1] > nums2[n1])) {
                num = nums1[m1];
                m1--;
            } else {
                num = nums2[n1];
                n1--;
            }
            arr[i] = num;
        }


        if ((m + n) % 2 == 1) {
            return arr[(m + n) / 2];
        } else {
            return (arr[(m + n) / 2] + arr[((m + n) / 2) - 1]) / 2.0;
        }

    }

    public static void main(String[] args) {

        int nums1[] = {1, 3, 5, 7};
        int nums2[] = {2, 4, 6};
        double ans = findMedianSortedArrays(nums1, nums2);

        System.out.println(ans);
    }

}
