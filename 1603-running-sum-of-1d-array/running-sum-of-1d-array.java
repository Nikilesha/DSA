class Solution {
    /*
    MY APPROACH
    static int help(int a,int b,int[] nums){
        int result =0;
        for(int j = a;j<=b;j++){
            result += nums[j];
        }
        return result;
    }
    public int[] runningSum(int[] nums) {
        for(int i =nums.length-1;i>0;i--){
            nums[i] = help(0,i,nums);
        }
        
        return nums;
    }
    */

    public int[] runningSum(int[] nums) {
        for(int i =1;i<nums.length;i++){
            nums[i] += nums[i-1];
        }
        
        return nums;
    }
}