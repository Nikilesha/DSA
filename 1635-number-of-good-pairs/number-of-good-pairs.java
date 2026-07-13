class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num,0);
            }
            else{
                map.put(num,map.get(num)+1);
                answer += map.get(num);
            }
        }

        return answer;
    }
}