import java.util.*;

class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);

        int radius = 0;

        for (int house : houses) {
            int idx = Arrays.binarySearch(heaters, house);

            if (idx < 0) {
                idx = -idx - 1;
            }

            int dist1 = idx < heaters.length ? 
                        Math.abs(heaters[idx] - house) : Integer.MAX_VALUE;

            int dist2 = idx > 0 ? 
                        Math.abs(heaters[idx - 1] - house) : Integer.MAX_VALUE;

            int nearest = Math.min(dist1, dist2);

            radius = Math.max(radius, nearest);
        }

        return radius;
    }
}
