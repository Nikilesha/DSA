class Solution {
    public int[] buildArray(int[] nums) {
        if(nums.length == 1 || nums.length == 0 ){
            return nums;
        }
        
        int[] ans = new int[nums.length];
        for(int i =0;i<=nums.length-1;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}