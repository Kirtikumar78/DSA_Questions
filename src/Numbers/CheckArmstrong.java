package Numbers;

import java.util.Scanner;

public class CheckArmstrong {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int original=num;
        while(num>0){
            sum=sum+(num%10)*(num%10)*(num%10);
            num=num/10;
        }
        if(sum==original){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }

    }
}
