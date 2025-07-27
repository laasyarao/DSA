package Maths;
public class SumofDigitPalindromeCheck {
    boolean isDigitSumPalindrome(int n) {
        // code here
        int sum=0;
        while(n>0){
            int lastDigit=n%10;
             sum =sum+lastDigit;
            n=n/10;
        }
        String s= String.valueOf(sum);
        StringBuffer sb= new StringBuffer(s);
        sb.reverse();
        return s.equals(sb.toString());
    }
}
