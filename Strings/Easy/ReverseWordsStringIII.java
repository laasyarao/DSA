package Strings.Easy;

public class ReverseWordsStringIII {
    public String reverseWords(String s) {

        String words[]=s.split(" ");
        for(int i=0;i<words.length;i++){
           words[i]=new StringBuilder(words[i]).reverse().toString();
    
        }
        return String.join(" ", words);
        //   StringBuilder result= new StringBuilder();
        //   for(int i=0;i<words.length;i++){
        //     StringBuilder word=new StringBuilder(words[i]);
        //     result.append(word.reverse());
        //     if(i<words.length-1){
        //         result.append(" ");
        //     }
        //   }  
        //   return result.toString();
        }
}
