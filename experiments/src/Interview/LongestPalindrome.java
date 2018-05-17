package Interview;

public class LongestPalindrome {

    public static String longestPalindrome(String str) {
        String palindrome;

        int start = 0, end = 0; //starting with position 0

        for (int i = 0; i < str.length(); i++) {

            int oddLen = expandAroundCenter(str, i, i);
            int evenLen = expandAroundCenter(str, i, i + 1);
            int len = Math.max(oddLen, evenLen);
            if (len > end - start) { // first only
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }

        }
        palindrome = str.substring(start, end + 1);
        return palindrome;
    }

    public static int expandAroundCenter(String in, int left, int right) {

        while (left >= 0 && right < in.length()
                && (in.charAt(left) == in.charAt(right))) {
            left--;
            right++;
        }

        return right - left - 1;
    }

    public static void main(String[] args) {

        System.out.println(longestPalindrome("babad"));

    }
}
