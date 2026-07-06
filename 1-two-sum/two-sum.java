import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        //Brute Force
        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }

        return new int[] {};
        */
        /*
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i =0;i<nums.length;i++){
            int needed = target-nums[i];

            if(map.containsKey(needed)){
                return new int[] {map.get(needed),i};
            }
            map.put(nums[i],i);
        }

        return new int[] {};

    */

    if(nums.length == 0){
            return new int[] {};
        }
        int i=0;
        int j = nums.length -1;
        
        while(i != nums.length && i <=j){
            if(nums[i]+nums[j] == target){
                return new int[] {i,j};
            }else{
                j--;
            }
            
            if(i == j){
                j = nums.length -1;
                i++;
            }
        }
        
        return new int[] {};


    }
}