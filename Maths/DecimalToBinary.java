package Maths;

public class DecimalToBinary {
    //Optimised and Best Approach
    public static void decToBin(int n){
        int number=n;
        StringBuilder binary= new StringBuilder();
        while(n>0){
            int rem=n%2;
            binary=binary.append(rem);
            n=n/2;
        } 
        binary.reverse();
        //Not so effiecent approach
        // public static void decToBin(int n){
        //     int number=n;
        //     int pow=0;
        //     int binary=0;
        //     while(n>0){
        //         int rem=n%2;
        //         binary=binary+(rem*(int)(Math.pow(10, pow)));
        //         n=n/2;
        //     } 
        System.out.println("Binary of " +number+ " is " +binary);
    }
    public static void main(String args[]){
      decToBin(15);
    }
}
