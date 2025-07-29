// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int temp = n;
        double sum = 0;
        while(temp!=0){
            int dig = temp%10;
            sum = sum + Math.pow(dig,3);
            temp = temp /10;
        }
        
        return sum == n;
        
    }
}