package Maths;

public class CommonFactors {
    public int commonFactors(int a, int b) {
        int gcd=findGCD(a, b);
        int count=0;
        for(int i=1;i<=gcd;i++){
            if(gcd%i==0){
                count=count+1;
            }
        }
        return count;
    }
    private int findGCD(int a, int b){
        while(a>0 && b>0){
            if(a>b) a=a%b;
            else b=b%a;
        }
        return (a==0)?b:a;
    }
}
