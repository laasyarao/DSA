package Maths;

public class BinaryToDecimal {
    public static void binToDec(String binStr){
        int decNum=0;
        int power=0;
        for(int i=binStr.length()-1;i>=0;i--){
          int digit=binStr.charAt(i)-'0';
          if(digit==1){
            decNum=decNum+digit*(int)Math.pow(2,power);
            power++;
          }
        }
        System.out.println(decNum);
    }
    public static void main(String args[]){
        binToDec("1111");

    }
}
