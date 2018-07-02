package Interview;

public class ZigZagConversion {

    public static void zigZag(String str, int n) {

        char[] strArray = str.toCharArray();

        int row = 0;
        String st = "";

        int skip = (n - 1) * 2;


        while (row < n) {

            int i = row;
            while (i < str.length()) {
                st = st + str.charAt(i);
                i = i + skip - (2 * row);

            }
            skip -= 2;
            row++;
        }
        System.out.println(st);
    }

    public static void main(String[] args) {

        zigZag("ABCDEFGHIJKL", 3);
    }
}
