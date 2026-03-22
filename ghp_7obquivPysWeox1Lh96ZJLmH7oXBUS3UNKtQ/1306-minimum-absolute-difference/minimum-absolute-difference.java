import java.util.*;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;

        // Find minimum difference
        for(int i = 1; i < arr.length; i++){
            int diff = arr[i] - arr[i-1];
            minDiff = Math.min(minDiff, diff);
        }

        // Collect pairs
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - arr[i-1] == minDiff){
                result.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }

        return result;
    }
}
