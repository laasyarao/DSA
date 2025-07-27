package Maths;

public class LargestPrimeFactor {
    static int largestPrimeFactor(int n) {
        // code here
        int arr[]=new int[n+1];
        for(int i=2;i<=n;i++){
            arr[i]=i;
        }
        for(int i=2;i*i<=n;i++){
            if(arr[i]==i){
                for(int j=i*i;j<=n;j=j+i){
                    if(arr[j]==j){
                        arr[j]=i;
                    }
                }
            }
        }
        int largest=0;
       while(n>0){
           largest=Math.max(largest, arr[n]);
           n=n/arr[n];
       }
       return largest;
    }
}
