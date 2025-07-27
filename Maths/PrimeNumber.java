package Maths;
public class PrimeNumber {

    public static boolean isPrime(int n){
      //without counting divisors
      
       if(n==1) return false;
       if(n==2) return true;
       for(int i=2;i*i<=n;i++){
          if(n%i==0) return false;
       }
       return true;


      //with counting divisors

      // if(n==1) return false;
      // if(n==2) return true;
      // int count=0;
      // for(int i=2;i*i<=n;i++){
      //      if(n%i==0){
      //       count++;
      //       if(i!=n/i) count++;
      //      }
      // }
      // if(count>0) return false;
      // return true;
    }
   public static void main(String args[]){
     System.out.println( isPrime(15));
   } 
}
