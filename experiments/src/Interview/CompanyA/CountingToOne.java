package Interview.CompanyA;

public class CountingToOne {

    /**
     * Counting to one, if n%2 == 1, then n = n/2; else n = 3*n+1;
     */

    public static void main(String[] args) {
        int n = 10;
        while (n != 1) {
            System.out.println(n);
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        System.out.println(n);
    }
}
