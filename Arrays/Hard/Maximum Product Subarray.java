// https://leetcode.com/problems/maximum-product-subarray/
class Solution {
    public int maxProduct(int[] nums) {
        int maxprod=Integer.MIN_VALUE;
        int prod=1;
        for(int i=0;i<nums.length;i++){
            prod*=nums[i];
            maxprod=Math.max(maxprod,prod);
            if(prod==0){
                prod=1;
            }
        }
        prod=1;
        for(int i=nums.length-1;i>=0;i--){
           prod*=nums[i];
            maxprod=Math.max(maxprod,prod);
            if(prod==0){
                prod=1;
            }
        }
        return maxprod;
    }
}
