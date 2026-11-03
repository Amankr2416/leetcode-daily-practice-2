class Solution {
    public int minMoves(int[] nums) {
        int mx=Integer.MIN_VALUE;
        for(int num : nums){
           mx=Math.max(mx,num);
        }
        int res=0;
        for(int num : nums){
            res+=(mx-num);
        }
        return res;
    }
}