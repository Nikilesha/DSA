class Solution {
    public int strStr(String haystack, String needle) {
        haystack = haystack.replace(needle,"*");
        if(haystack.indexOf("*") != -1){
            return haystack.indexOf("*");
        }
        else{
            return -1;
        }
    }
}