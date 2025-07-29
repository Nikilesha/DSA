class Solution {
    public static long sumOfDivisors(long n) {
        // code here
        int ans= 0;
        for(int i =1;i<=n;i++){
            if(n%i==0){
                ans+= n;
            }
            else{
                ans += i*(n/i);
            }
        }
        
        return ans;
    }
}