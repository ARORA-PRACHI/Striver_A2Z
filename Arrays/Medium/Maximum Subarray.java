// https://leetcode.com/problems/maximum-subarray/submissions/1622866288/
class Solution {
    public int maxSubArray(int[] nums) {
        int msum=Integer.MIN_VALUE;
        int csum=0;
        for(int i=0;i<nums.length;i++){
            csum+=nums[i];
            msum=Math.max(csum,msum);
            if(csum<0){
                csum=0;
            }
        }
        return msum;
    }
}
