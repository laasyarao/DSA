package Maths;

public class Pow {
    public double myPow(double x, int n) {
        double ans=1.0;
        long exp=n;
        if(exp<0){
            x=1/x;
            exp=-exp;
        }
        while(exp>0){
            if(exp%2!=0){
               ans=ans*x;
               exp--;
            }
            else{
                exp=exp/2;
                x=x*x;
            }
        }
   
        return ans;

    }
}
