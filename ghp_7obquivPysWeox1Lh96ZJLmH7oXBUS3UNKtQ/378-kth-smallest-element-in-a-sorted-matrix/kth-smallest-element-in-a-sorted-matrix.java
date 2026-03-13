import java.util.*;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> a[0] - b[0]
        );

        int n = matrix.length;

        for(int i=0;i<n;i++){
            pq.offer(new int[]{matrix[i][0], i, 0});
        }

        int count = 0;

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int val = curr[0];
            int r = curr[1];
            int c = curr[2];

            count++;

            if(count == k) return val;

            if(c+1 < n){
                pq.offer(new int[]{matrix[r][c+1], r, c+1});
            }
        }

        return -1;
    }
}
