// https://leetcode.com/problems/single-number/submissions/1621859955/
class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i:nums){
            ans^=i;
        }
        return ans;
    }
}
