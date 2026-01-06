import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*
        //MY APPROACH
        HashMap<Integer,Integer> map = new HashMap<>();
        boolean hasDuplicates = false; 
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int id: nums){
            if(map.get(id)>1){
                hasDuplicates = true;
            }
        }

        return hasDuplicates;
        */

        HashSet<Integer> map = new HashSet<>();

        for(int num:nums){
            if(map.contains(num)){
                return true;
            }
            else{
                map.add(num);
            }
        }
        return false;


    }
}