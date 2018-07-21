package Interview.CompanyA;

public class PrecisionSqrt {
    /**
     * Finding a sqrt of a number upto a certain precision
     */

    public static void precSqrt(int num, int precision) {

        int start = 0, end = (num / 2) + 1;

        double ans = 0.0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid == num / mid)
                ans = mid;

            if (mid < num / mid) {
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }


        double increment = 0.1;
        for (int i = 0; i < precision; i++) {
            while (ans * ans <= num) {
                ans += increment;
            }

            ans = ans - increment;
            increment = increment / 10;
        }

        System.out.println((float)ans);

    }

    public static void main(String[] args) {

        int n = 2147395599; // 46339
        int precision = 4;

        precSqrt(n, precision);

    }
}
