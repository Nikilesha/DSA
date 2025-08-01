// User function Template for Java
class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> nums = new ArrayList<Long>();
        long fact = 1;
        int i = 1;
        
        while (fact <= n) {
            nums.add(fact);
            i++;
            fact *= i;
        }

        return nums;
        
    }
}