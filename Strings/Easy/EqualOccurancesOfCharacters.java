package Strings.Easy;

import java.util.Arrays;

public class EqualOccurancesOfCharacters {
    public boolean areOccurrencesEqual(String s) {
        int arr[]=new int[26];
        Arrays.fill(arr,0);
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        int freq=arr[s.charAt(0)-'a'];
        for(int i=0;i<26;i++){
            if(arr[i]==0) continue;
            else if(arr[i]!=freq) return false;
        }
        return true;
    //  HashMap<Character, Integer> map= new HashMap<>();
    //  for(char ch :s.toCharArray()){
    //     map.put(ch, map.getOrDefault(ch, 0)+1);
    //  }   
    //  int temp=-1;
    //  for(int i:map.values()){
    //     if(temp==-1){
    //         temp=i;
    //     }
    //     else if(temp!=i){
    //         return false;
    //     }
        
    //  }
    //  return true;
    //  HashSet<Integer> set= new HashSet<>(map.values());
    //  return (set.size()==1);
    } 
}
