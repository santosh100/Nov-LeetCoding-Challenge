class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        
        //Approach - 1 
        /*
        for(int i=0; i<A.length; i++){       
            int n = A[i].length;
            if((n^1) == n+1)    //to check whether even or odd
                n = n/2;
            else{
                n = (n+1)/2;
            }
            for(int j=0; j<n; j++){
                int a = A[i][j];
                int b = A[i][A[i].length-1-j];
                a = a == 1 ? 0 : 1;
                b = b == 1 ? 0 : 1;
                A[i][j] = b;
                A[i][A[i].length-1-j] = a;               
            }
        }
        return A;
        */
        
        
        //Approach - 2
        
        int n = A[0].length;
        for(int arr[] : A){
            for(int i=0; i<(n+1)/2; i++){
                if(arr[i] == arr[n-1-i]){
                    int tmp = arr[i] ^ 1;
                    arr[i] = arr[n-1-i] ^ 1;
                    arr[n-1-i] = tmp;
                }
            }
        }
        return A;
    }
}