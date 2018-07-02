package Interview;


public class ChainDiscount {
    public static void main(String[] args){
        int[] prices = {1, 3, 3, 2, 5};
        finalPrice(prices);
    }

    public static void finalPrice(int[] prices) {

        String nonDiscountIdx = "";

        for (int i = 0; i < prices.length; i++) {
            int j;
            for (j = i + 1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) {
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
            if (j == prices.length) {
                nonDiscountIdx = nonDiscountIdx + i + " ";
            }
        }

        System.out.println(sum(prices));
        System.out.println(nonDiscountIdx);

    }

    public static long sum(int[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
