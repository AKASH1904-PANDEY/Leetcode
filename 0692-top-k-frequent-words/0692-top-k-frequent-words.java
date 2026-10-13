class Solution {
    public List<String> topKFrequent(String[] words, int k) {
     //   int n = words.length();
        Map<String,Integer> map = new HashMap<>();
        for(String ch: words){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return b.compareTo(a);
            }
            return map.get(a) - map.get(b);
        });
        for(String key :map.keySet()){
            pq.add(key);
            if(pq.size()>k) pq.poll();
        }
        List<String> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            res.add(pq.poll());
        }
        Collections.reverse(res);
        return res;
    }
}