class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mpp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int rem=target-nums[i];
            if(mpp.containsKey(rem)){
                return new int[]{mpp.get(rem),i};
            }
            mpp.put(nums[i],i);
        }
        return new int[]{};
    }
}