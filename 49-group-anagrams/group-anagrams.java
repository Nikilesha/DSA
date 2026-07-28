class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0){
            return new ArrayList<>();
        }
        HashMap<String ,List<String>> map = new HashMap<>();
        for(int i =0;i<strs.length;i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String arranged = new String(chars);
            if(!map.containsKey(arranged)){
                map.put(arranged, new ArrayList<>());
            }
            map.get(arranged).add(strs[i]);

        }   

        return new ArrayList<>(map.values());
    }
}