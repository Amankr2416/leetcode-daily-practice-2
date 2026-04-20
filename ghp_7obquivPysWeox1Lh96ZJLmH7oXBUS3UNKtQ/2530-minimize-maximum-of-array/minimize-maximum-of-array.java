class Solution {
    public int minimizeArrayValue(int[] nums) {
        long sum = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            // ceiling division
            int avg = (int)((sum + i) / (i + 1));

            result = Math.max(result, avg);
        }

        return result;
    }
}