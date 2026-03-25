package TcsPyq;

import java.util.Scanner;

public class VehicleQuestion {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int V=sc.nextInt();
        int W=sc.nextInt();
        int twoWheeler=(4*V-W)/2;
        int fourWheeler=V-twoWheeler;
        System.out.println("TW="+twoWheeler+"FW="+fourWheeler);



    }
}
