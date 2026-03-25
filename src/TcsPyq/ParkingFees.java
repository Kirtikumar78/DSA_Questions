package TcsPyq;

import java.util.Scanner;

public class ParkingFees {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int hours=sc.nextInt();
        int amount;
        if(hours<=2){
            amount=100*hours;
        }
        else if(hours>2 && hours<=5){
            amount=200+(50*(hours-2));
        }
        else {
            amount=350+(20*(hours-5));
        }
        System.out.println(amount);
    }
}
