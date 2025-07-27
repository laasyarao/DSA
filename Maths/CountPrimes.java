package Maths;

public class CountPrimes {
    //using Sieve of Eratosthenes
    //Time Complexity is O(n log(log n)) and space complexity is O(n)
        public int countPrimes(int n) {
            int arr[]= new int[n];
            for(int i=2;i<n;i++){
               arr[i]=1;
            }
            for(int i=2;i*i<n;i++){
                if(arr[i]==1){
                    for(int j=i*i;j<n;j=i+j){
                        arr[j]=0;
                    }
                }
            }
            int count=0;
            for(int i=2;i<n;i++){
                if(arr[i]==1){
                    count++;
                }
            }
        return count;
        }
    }
