import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {
        int readIndex= 0;
        int writeIndex = 0;
        
        while(readIndex <= nums.length-1){
            if(nums[readIndex]!= val){
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
            readIndex++;
        }

        return writeIndex;
    }
}