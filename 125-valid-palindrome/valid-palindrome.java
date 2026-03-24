class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");

        if(s.length() == 0){
            return true;
        }
        
        int left = 0;
        for(int right = s.length()-1;left<right;right--){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
        }
        return true;
    }
}