class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_value = 0;
        int count = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                max_value = Math.max(max_value, count);
                count = 0;

            }
        }
        return Math.max(count, max_value);
    }
}