class Solution {
    int mod = 1337;

    public int superPow(int a, int[] b) {
        return helper(a, b, b.length - 1);
    }

    private int helper(int a, int[] b, int idx) {
        if (idx < 0) return 1;

        int part1 = power(helper(a, b, idx - 1), 10);
        int part2 = power(a, b[idx]);

        return (part1 * part2) % mod;
    }

    private int power(int a, int k) {
        int result = 1;
        a %= mod;

        for (int i = 0; i < k; i++) {
            result = (result * a) % mod;
        }

        return result;
    }
}