package Interview.CompanyA;

public class BinarySearchSqrt {

    public static int sqrt(int num) {


        int start = 1, end = num/2 + 1, ans = 0;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (mid * mid == num)
                return mid;

            if (mid * mid < num) {
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }


        return ans;
    }

    public static void main(String[] args) {
        int x = 9;
        System.out.println(sqrt(x));
    }
}
