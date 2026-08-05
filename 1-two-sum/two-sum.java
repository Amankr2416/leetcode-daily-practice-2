class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Map<Integer,Integer> sum=new HashMap<>();
        for(int i=0;i<n;i++){
            
            if(sum.containsKey(target-nums[i])){
            return new int[]{sum.get(target-nums[i]),i};
            }
            sum.put(nums[i],i);
        }
        return new int[]{};
    }
}