class Solution {
    public boolean isPalindrome(int x) {
        // Edge cases
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversed = 0;

        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        // Even digits: x == reversed
        // Odd digits: x == reversed/10
        return x == reversed || x == reversed / 10;
    }
}
