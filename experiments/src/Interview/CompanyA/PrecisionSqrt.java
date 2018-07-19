package Interview.CompanyA;

public class PrecisionSqrt {
    /**
     * Finding a sqrt of a number upto a certain precision
     */

    public static void precSqrt(int n, int precision) {

        int start = 0, end = (n / 2) + 1;

        double ans = 0.0;


        while (start <= end) {
            int mid = (start + end) / 2;

            if (mid * mid == n) {
                ans = mid;
                break;
            }

            if (mid * mid < n) {
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        double increment = 0.1;
        for (int i = 0; i < precision; i++) {
            while (ans * ans <= n) {
                ans += increment;
            }
            ans = ans - increment;
            increment = increment / 10;
        }

        System.out.println((float) ans);

    }

    public static void main(String[] args) {

        int n = 1;
        int precision = 4;

        precSqrt(n, precision);

    }
}
