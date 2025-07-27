package Maths;
import java.util.ArrayList;
import java.util.Collections;
public class AllDivisiorsOfNumber {
    public static void print_divisors(int n) {
        ArrayList<Integer> list= new ArrayList<>();
        // code here
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                list.add(i);
                if(i!=n/i){
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+ " ");
        }
    }
}
