import java.util.*;

class Solution {
    public boolean canReorderDoubled(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Sort by absolute value
        Integer[] nums = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(nums, (a, b) -> Integer.compare(Math.abs(a), Math.abs(b)));

        for (int num : nums) {
            if (map.get(num) == 0) continue;

            if (map.getOrDefault(2 * num, 0) == 0) {
                return false;
            }

            map.put(num, map.get(num) - 1);
            map.put(2 * num, map.get(2 * num) - 1);
        }

        return true;
    }
}
