class Solution {
    static int square(int temp){
        int sum = 0;
        while(temp>0){
            int dig = temp%10;
            sum += dig*dig;
            temp /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow = square(n);
        int fast = square(square(n));

        while(slow != fast && fast != 1){
            slow = square(slow);
            fast = square(square(fast));

            
        }
        return fast == 1;
    }
}