package Interview.CompanyB;


public class ChainDiscount {
    public static void main(String[] args) {
        int[] prices = {2, 3, 1, 2, 4, 2};
        finalPrice(prices);
    }

    public static void finalPrice(int[] prices) {

        String nonDiscountIdx = "";

        int idx = -1;

        for (int i = 1; i < prices.length ; i++) {

            if (prices[i - 1] >= prices[i]) {
                for (int j = i - 1; j > idx; j--) {
                    prices[j] = prices[j] - prices[i];
                }
                idx = i;
                nonDiscountIdx = nonDiscountIdx + idx + " ";
                i++;
            }
        }
        System.out.println(sum(prices));
        System.out.println(nonDiscountIdx);

    }

    public static long sum(int[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }
        return sum;
    }
}
