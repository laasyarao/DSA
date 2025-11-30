package Strings.Easy;

public class ValidAnagaram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int []arr= new int[26];
        for(int i=0;i<s.length();i++){
           arr[s.charAt(i)-'a']++; 
        }
        for(int i=0;i<t.length();i++){
            arr[t.charAt(i)-'a']--;
            if(arr[t.charAt(i)-'a']<0){
                return false;
            }
        }
        // Map<Character, Integer>hm= new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     char c1=s.charAt(i);
        //     char c2=t.charAt(i);
        //     hm.put(c1, hm.getOrDefault(c1,0)+1);
        //     hm.put(c2, hm.getOrDefault(c2,0)-1);
        // }
        // for(int i:hm.values()){
        //     if(i!=0){
        //         return false;
        //     }
        // }
        return true;
    }
}
