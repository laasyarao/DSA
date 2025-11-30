package Strings.Easy;

public class FindDifference {
    public char findTheDifference(String s, String t) {
        char c=0;
        for(int i=0;i<s.length();i++){
            char st=s.charAt(i);
            // c=(char)(c^st);
            c^=st;
        }
        for(int i=0;i<t.length();i++){
            char tt=t.charAt(i);
            // c=(char)(c^tt);
            c^=tt;
        }
        return c;
        // int arr[]= new int[26];
        // for(int i=0;i<s.length();i++){
        //     arr[s.charAt(i)-'a']++;
        // }
        // for(int j=0;j<t.length();j++){
        //     arr[t.charAt(j)-'a']--;
        // }
        // for(int i=0;i<26;i++){
        //     if(arr[i]!=0){
        //         return (char)(i+'a');
        //     }
        // }
        // return 0;
    }
}
