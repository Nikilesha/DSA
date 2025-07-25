import java.util.*;
class Solution {
    public static int countDigits(int num) {
        int temp = num;
        int count=0;
        while(temp>0){
            int digit = temp %10;
            if(num%digit==0){
                count++;
            }
            temp /= 10;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = countDigits(num);
        System.out.println(result);
    }
}