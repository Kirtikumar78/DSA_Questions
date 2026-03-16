package Numbers;

import java.util.Scanner;

public class SumOfFibonacci {
    public static int printFibonacci(int n){
        int a=0;
        int b=1;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+a;
            int next=a+b;
            a=b;
            b=next;
        }
        return sum;
    }
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int result=printFibonacci(number);
        System.out.println(result);

    }
}
