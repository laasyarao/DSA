package Strings.Easy;

public class IndexOfFirstOccurance {
    public int strStr(String haystack, String needle) {
        int index=-1;
       if(haystack.contains(needle)){
         index=haystack.indexOf(needle);
       }
       return index;
    }
}
