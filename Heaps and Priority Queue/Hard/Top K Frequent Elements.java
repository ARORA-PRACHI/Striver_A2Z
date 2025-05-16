// https://leetcode.com/problems/top-k-frequent-elements/description/

Bucket Sort + HashMap (Time: O(n)) — ✅ Best Approach under Constraints

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer>[] buckets=new ArrayList[nums.length+1];
        for(int key:map.keySet()){
            int freq=map.get(key);
            if(buckets[freq]==null){
                buckets[freq]=new ArrayList<>();
            }
            buckets[freq].add(key);
        }
        List<Integer>result=new ArrayList<>();
        for(int i=buckets.length-1;i>=0 && result.size()<k ;i--){
            if(buckets[i]!=null){
                result.addAll(buckets[i]);
            }
        }
        int [] topk=new int[k];
        for(int i=0;i<k;i++){
            topk[i]=result.get(i);
        }
        return topk;
    }
}
