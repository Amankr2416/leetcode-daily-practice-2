import java.util.*;

class Solution {
    public int minAreaRect(int[][] points) {
        Set<String> set = new HashSet<>();

        // Store points
        for (int[] p : points) {
            set.add(p[0] + "," + p[1]);
        }

        int minArea = Integer.MAX_VALUE;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {

                int x1 = points[i][0], y1 = points[i][1];
                int x2 = points[j][0], y2 = points[j][1];

                // Skip if not diagonal
                if (x1 == x2 || y1 == y2) continue;

                // Check other two corners
                if (set.contains(x1 + "," + y2) &&
                    set.contains(x2 + "," + y1)) {

                    int area = Math.abs(x1 - x2) * Math.abs(y1 - y2);
                    minArea = Math.min(minArea, area);
                }
            }
        }

        return minArea == Integer.MAX_VALUE ? 0 : minArea;
    }
}
