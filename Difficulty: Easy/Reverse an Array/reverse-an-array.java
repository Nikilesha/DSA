class Solution {
    
    private void reverseArrayHelper(int arr[],int l,int r){
        if(l>=r){
            return;
        }
        
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        
        reverseArrayHelper(arr,l+1,r-1);
        
        
    }
    public void reverseArray(int arr[]) {
        
        if(arr.length==1){
            return;
        }
        
        reverseArrayHelper(arr,0,arr.length-1);
        
        
    }
}