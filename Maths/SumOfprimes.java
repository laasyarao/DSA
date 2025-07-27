package Maths;

public class SumOfprimes {
    public int prime_Sum(int n) {
        int arr[]= new int[n+1];
        for(int i=2;i<=n;i++){
            arr[i]=1;
        }
        for(int i=2;i*i<=n;i++){
            if(arr[i]==1){
                for(int j=i*i;j<=n;j=i+j){
                    arr[j]=0;
                }
            }
        }
        int sum=0;
        for(int i=2;i<arr.length;i++){
            if(arr[i]==1){
                sum=sum+i;
            }
        }
        return sum;
    }
}
