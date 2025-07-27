package Maths;

public class LCMandGCD {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int res[]= new int[2];
        res[1]=findGCD( a,  b);
        res[0]=findLCM( a,  b, res[1]);
     return res;
    }
    private static int findGCD(int a, int b){
        //int gcd=1;
        // int mini=Math.min(a,b);
        // for(int i=mini;i>=1;i--){
        //     if(a%i==0 && b%i==0){
        //         gcd=i;
        //         break;
        //     }
        // }
        //return gcd;
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else {
                b=b%a;
            }
        }
        if(a==0) return b;
        return a;
    }
    private static int findLCM(int a, int b, int gcd){
        int lcm=(a*b)/gcd;
        return lcm;
    }
}
