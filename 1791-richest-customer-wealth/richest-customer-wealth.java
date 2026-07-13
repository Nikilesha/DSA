class Solution {
    public int maximumWealth(int[][] accounts) {
        
        
        int max_salary = 0;
        for(int i =0;i<accounts.length;i++){
            int sal = 0;
            for(int j = 0;j<accounts[i].length;j++){
                sal += accounts[i][j];
            }
            max_salary = Math.max(max_salary,sal);
        }
        
        return max_salary;
    }
}