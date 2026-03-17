import java.util.*;

class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        int[] minutes = new int[n];

        // Convert to minutes
        for(int i = 0; i < n; i++){
            String t = timePoints.get(i);
            int h = Integer.parseInt(t.substring(0, 2));
            int m = Integer.parseInt(t.substring(3));
            minutes[i] = h * 60 + m;
        }

        Arrays.sort(minutes);

        int minDiff = Integer.MAX_VALUE;

        // Check adjacent
        for(int i = 1; i < n; i++){
            minDiff = Math.min(minDiff, minutes[i] - minutes[i-1]);
        }

        // Circular case
        minDiff = Math.min(minDiff, 
            1440 - minutes[n-1] + minutes[0]);

        return minDiff;
    }
}
