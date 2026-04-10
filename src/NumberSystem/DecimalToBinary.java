package NumberSystem;

import java.util.Scanner;

public class DecimalToBinary {
    public static String binaryToDecimal(int n){
        String binary="";
        while(n>0){
            binary=(n%2)+binary;
            n=n/2;
        }
        return binary;
    }
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        String s = binaryToDecimal(n);
        System.out.println(s);

    }
}
