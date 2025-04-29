// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0;
        for(int j=0;j<n;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}


// Approach-2
class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set=new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        List<Integer> list=new ArrayList<>(set);
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return set.size();
    }
}
