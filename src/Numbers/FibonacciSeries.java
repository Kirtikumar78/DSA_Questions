package Numbers;

import java.util.Scanner;

public class FibonacciSeries {
    public static void printFibonacci(int n){
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            System.out.print(a +" ");
            int next=a+b;
            a=b;
            b=next;
        }
    }
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        printFibonacci(number);

    }
}
