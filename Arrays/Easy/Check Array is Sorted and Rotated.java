https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int breaking_point=0;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                breaking_point++;
            }
            if(breaking_point>1){
                return false;
            }
        }
        return true;
    }
}


//Approach-2
class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
            }
        }
        if(nums[0]<nums[n-1]) count++;
        if(count<=1) return true;
        return false;
    }
}
