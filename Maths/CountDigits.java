package Maths;
public class CountDigits {
    static int evenlyDivides(int n) {
        // code here
        int count=0;
        int number=n;
        while(number>0){
            int lastDigit=number%10;
            if(lastDigit!=0 && n%lastDigit==0){
                 count++;
            }
           number=number/10;
        }
        return count;
    }
}
