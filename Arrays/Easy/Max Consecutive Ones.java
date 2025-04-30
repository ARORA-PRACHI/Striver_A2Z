// https://leetcode.com/problems/max-consecutive-ones/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int mcount=0;
        int ccount=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                ccount++;
                mcount=Math.max(ccount,mcount);
            }
            else{
                ccount=0;
            }
        }
        return mcount;
    }
}
