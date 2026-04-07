import java.util.*;

class Solution {
    public boolean[] subsequenceSumAfterCapping(int[] nums, int k) {
        int n = nums.length;
        boolean[] ans = new boolean[n];

        Arrays.sort(nums);

        boolean[] dp = new boolean[k + 1];
        dp[0] = true;

        int idx = 0;

        for (int x = 1; x <= n; x++) {

            // include all nums ≤ x into DP
            while (idx < n && nums[idx] <= x) {
                int num = nums[idx];
                for (int s = k; s >= num; s--) {
                    dp[s] |= dp[s - num];
                }
                idx++;
            }

            int cntBig = n - idx;

            // try using t big elements (each contributes x)
            for (int t = 0; t <= cntBig; t++) {
                int remaining = k - t * x;
                if (remaining < 0) break;

                if (dp[remaining]) {
                    ans[x - 1] = true;
                    break;
                }
            }
        }

        return ans;
    }
}