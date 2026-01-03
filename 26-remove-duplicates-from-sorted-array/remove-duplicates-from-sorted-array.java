class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        
        int left = 0;
        int right = 1;
        while(right <= nums.length-1){
            if(nums[left]==nums[right]){
                right++;
            }
            else{
                left++;
                nums[left] = nums[right];
                right++;
            }
        }

        return left + 1;
        
    }
}