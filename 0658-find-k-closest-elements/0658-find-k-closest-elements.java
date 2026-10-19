class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b)->{
                if(b[0]!=a[0]){
                    return Integer.compare(b[0], a[0]);
                }else{
                    return Integer.compare(b[1],a[1]);
                }
            });
            for(int num :arr){
                int distance =Math.abs(num-x);
                pq.offer(new int[]{distance,num});

                if(pq.size()>k){
                    pq.poll();
                }
            }
            List<Integer> res = new ArrayList<>();
            while(!pq.isEmpty()){
                res.add(pq.poll()[1]);
            }
            Collections.sort(res);
            return res;
    }
}