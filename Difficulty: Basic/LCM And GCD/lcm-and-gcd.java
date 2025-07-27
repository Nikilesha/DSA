class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        if(a==1 && b ==1){
            return new int[]{a,b};
        }
        int high=0;
        int lcm=0;
        int hcf=0;
        if(a>b){
            high = a;
        }
        else{
            high=b;
        }
        
        for(int i =1;i<=high;i++){
            if(a%i ==0 && b%i ==0){
                hcf = i;
            }
        }
        
        lcm = (a*b)/hcf;
        
        return new int[]{lcm,hcf};
        
    }
}