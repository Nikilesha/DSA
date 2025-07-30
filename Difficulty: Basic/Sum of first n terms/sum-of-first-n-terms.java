// User function Template for Java

class Solution {
    int sumOfSeries(int n) {
        // code here
        int sum=0;
        if(n == 1){
            return 1;
        }
         
        return (int) Math.pow(n,3)+sumOfSeries(n-1);
    }
}