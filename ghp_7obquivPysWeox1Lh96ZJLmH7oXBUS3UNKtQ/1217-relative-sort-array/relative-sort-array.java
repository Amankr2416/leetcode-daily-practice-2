import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for(int num : arr1){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[arr1.length];
        int index = 0;

        // Place elements from arr2
        for(int num : arr2){
            int freq = map.get(num);
            while(freq-- > 0){
                result[index++] = num;
            }
            map.remove(num);
        }

        // Remaining elements
        List<Integer> remaining = new ArrayList<>();

        for(int key : map.keySet()){
            int freq = map.get(key);
            while(freq-- > 0){
                remaining.add(key);
            }
        }

        Collections.sort(remaining);

        for(int num : remaining){
            result[index++] = num;
        }

        return result;
    }
}
