package Maths;

public class ReversingEquation {
    static String reverseEqn(String S) {
        // your code here
        StringBuilder num= new StringBuilder();
        StringBuilder res=new StringBuilder();
        for(int i=S.length()-1;i>=0;i--){
            char ch=S.charAt(i);
            if(Character.isDigit(ch)){
                num.append(ch);
            }
            else{
                res.append(num.reverse()).append(ch);
                num.setLength(0);
            }
        }
        res.append(num.reverse());
        return res.toString();
    }
    public static void main(String args[]){
        System.out.println(reverseEqn("20-3+5*2"));
    }
}
