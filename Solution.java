/* 
 * Keys:
 * - check palindrome by comparing the first half and the later half of the same integer (halve the number))
 * - we can get the last digit of an integer by %10
 * - we can get rid of the last digit of an integer by /10
 */
class Solution {
    public boolean isPalindrome(int x) {
        // Base Cases
        if (x == 0) return true;
        if (x < 0 || x % 10 == 0) return false; // `x%10 == 0` is for leading zeroes in reversed integer
        // Palindrome Check
        int rev = 0;
        while (x > rev) {
            int lastDigit = x % 10;
            x /= 10; // remove the last digit
            rev = (rev * 10) + lastDigit;
        }
        if (x == rev || x == rev / 10) return true; // `rev / 10` is to address the extra 1 digit of reversed number
        else return false;
    }
}