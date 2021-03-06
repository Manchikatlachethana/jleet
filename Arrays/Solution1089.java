class Solution {
    public void duplicateZeros(int[] arr) {
        int zeros = 0;
        for(int i:arr){
            if(i==0){
                zeros++;
            }
        }
        int i=arr.length-1;
        int j=arr.length-1+zeros;
        while(i!=j){
            insert(arr,i,j);
            j--;
            if(arr[i]==0){
                insert(arr,i,j);
                j--;
            }
            i--;
        }
    }    
    private void insert(int[] arr, int i, int j){
        if(j<arr.length){
            arr[j]=arr[i];
        }
    }
}
/*
class Solution {
    public void duplicateZeros(int[] arr) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            q.add(arr[i]);
            if(arr[i]==0){
                q.add(0);
            }
            arr[i]=q.remove();
            
        }
    }
}
*/
