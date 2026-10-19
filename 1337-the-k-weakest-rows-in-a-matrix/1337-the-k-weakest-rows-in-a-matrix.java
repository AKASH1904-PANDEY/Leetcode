class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b)-> {
                if(a[0]!=b[0]){
                    return Integer.compare(b[0],a[0]);
                }else{
                    return Integer.compare(b[1],a[1]);
                }
            });
            for(int i=0;i<mat.length;i++){
                int s =0;
                for(int j=0;j<mat[i].length;j++){
                    if(mat[i][j]==1){
                        s++;
                    }
                }
                pq.offer(new int[]{s,i});
                if(pq.size()>k){
                    pq.poll();
                }
            }
            int[] res = new int[k];
            for(int i=k-1;i>=0;i--){
                res[i] = pq.poll()[1];
            }
            
            return res;
    }
}