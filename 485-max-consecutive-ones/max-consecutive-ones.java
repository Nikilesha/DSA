class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i =0;
        int j = 0;
        int max_value=0;
        int temp=0;
        while(j < nums.length){
            if(nums[j] == 1){
                j++;
                temp++;
            }
            else{
                i = j;
                temp = 0;
                j++;
                
            }
            max_value = Math.max(max_value,temp);
        }
        return max_value;
    }
}