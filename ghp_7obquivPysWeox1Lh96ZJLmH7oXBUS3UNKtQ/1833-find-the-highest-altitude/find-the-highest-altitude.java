class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int current = 0;

        for (int g : gain) {
            current += g;
            maxAltitude = Math.max(maxAltitude, current);
        }

        return maxAltitude;
    }
}