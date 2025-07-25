package Maths;
public class OctalToDecimal {
    public static void binToDec(String binStr){
        int octNum=0;
        int power=0;
        for(int i=binStr.length()-1;i>=0;i--){
          int digit=binStr.charAt(i)-'0';
          if(digit < 0 || digit > 7){
            System.out.println("Invalid octal number.");
            return;
        }
            octNum=octNum+digit*(int)Math.pow(8,power);
            power++;
          
        }
        System.out.println(octNum);
    }
    public static void main(String args[]){
        binToDec("111"); //output-73

    }
}
