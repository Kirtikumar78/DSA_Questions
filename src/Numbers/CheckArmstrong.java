package Numbers;

import java.util.Scanner;

public class CheckArmstrong {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int original=num;
        int digits=String.valueOf(num).length();
        while(num>0){
            int digit=num%10;
            sum=(int)(sum+Math.pow(digit,digits));
            num=num/10;

        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }


    }
}
