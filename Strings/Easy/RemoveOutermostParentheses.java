package Strings.Easy;

public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String s) {
        int counter=0;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(counter!=0){
                    res.append('(');
                }
                counter++;
            }
            else{
              counter--;
                if (counter > 0) {   // only keep if it's NOT outermost
                res.append(')');
                }
            }
 

        }
        return res.toString();
    }
}
