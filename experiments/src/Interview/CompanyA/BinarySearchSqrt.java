package Interview.CompanyA;

public class BinarySearchSqrt {

    /**
     * Finding nearest square-root using binary search method
     */

    public static int sqrt(int num) {
        int start = 1, end = num / 2 + 1, ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid == num / mid)
                return mid;

            if (mid < num / mid) {
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 2147395599;
        System.out.println(sqrt(x));
    }
}
