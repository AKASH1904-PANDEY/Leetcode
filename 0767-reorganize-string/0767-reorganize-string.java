class Solution {
    public String reorganizeString(String s) {
       Map<Character,Integer> map = new HashMap<>();
       for(char ch : s.toCharArray()){
        map.put(ch, map.getOrDefault(ch,0)+1);
       } 
       PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[1]-a[1]);
       for(Map.Entry<Character,Integer> entry : map.entrySet()){
        pq.offer(new int[]{entry.getKey(),entry.getValue()});
       }
       StringBuilder res = new StringBuilder();
       while(pq.size()>1){
        int[] first = pq.poll();
        int[] second = pq.poll();

        res.append((char) first[0]);
        res.append((char) second[0]);

        first[1]--;
        second[1]--;

        if(first[1]>0){
            pq.offer(first);
        }
        if(second[1]>0){
            pq.offer(second);
        }
       }
       if(!pq.isEmpty()){
         int[] last = pq.poll();

         if(last[1]>1){
            return "";
         }
         res.append((char) last[0]);
       }
       return res.toString();
    }

}