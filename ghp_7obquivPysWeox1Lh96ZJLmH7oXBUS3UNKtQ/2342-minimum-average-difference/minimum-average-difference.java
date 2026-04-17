class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long total = 0;

        for (int num : nums) {
            total += num;
        }

        long leftSum = 0;
        int resultIndex = 0;
        long minDiff = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            leftSum += nums[i];

            long leftAvg = leftSum / (i + 1);
            long rightAvg = (i == n - 1) ? 0 : (total - leftSum) / (n - i - 1);

            long diff = Math.abs(leftAvg - rightAvg);

            if (diff < minDiff) {
                minDiff = diff;
                resultIndex = i;
            }
        }

        return resultIndex;
    }
}