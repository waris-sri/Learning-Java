import java.lang.Math;

class LongestPalindrome {
    public static String longestPalindrome(String input) {
        if (input.isEmpty())
            return "";

        int start = 0;
        int end = 0;

        for (int i = 0; i < input.length(); i++) {
            int oddLength = expandCenteredAt(input, i, i);
            int evenLength = expandCenteredAt(input, i, i + 1);
            int maxLength = Math.max(oddLength, evenLength);

            if (maxLength > end - start) {
                start = i - (maxLength - 1) / 2;
                end = i + maxLength / 2;
            }
        }

        return input.substring(start, end + 1);
    }

    private static int expandCenteredAt(String input, int left, int right) {
        while (left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static int expand(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1; // return palindrome length
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
    }
}

/*
 * check by expanding from the palindrome's centerpoint
 * - could be odd/even in length
 * - create .expand() <int>
 * - while L<=0 && R<=s.length() && the current character of L is the same as R
 * - decrement left pointer (to leftside) and increment right pointer (to
 * rightside)
 * - finally use built-in .substring() to return longest palindrome
 */