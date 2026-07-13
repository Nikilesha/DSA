class Solution {
    public int findNumbers(int[] nums) {
        int max_count=0;
        for(int num : nums){
            int temp = num;
            int count = 0;
            while(temp >0){
                count++;
                temp = temp / 10;
            }
            if(count %2 ==0){
                max_count++;
            }

        }
        return max_count;
    }
}