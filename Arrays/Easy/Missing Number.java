// https://leetcode.com/problems/missing-number/submissions/1621853297/
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int tsum=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        return tsum-sum;
    }
}
