class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);   //sorting
        int n=nums.length;
        int closestSum=nums[0]+nums[1]+nums[2];

        for(int i=0;i<n;i++){
            int left=i+1;
            int right=n-1;

            while(left<right){
                int currSum=nums[i]+nums[left]+nums[right];

                if (Math.abs(currSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currSum;
                }

                if (currSum == target) {
                    return currSum; // best possible match
                } else if (currSum < target) {
                    left++; // need a bigger sum
                } else {
                    right--; // need a smaller sum
                }
            }
        }
        return closestSum;
            
    }
}