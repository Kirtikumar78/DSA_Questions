package Arrays;

import java.util.Scanner;

public class RotateArrayByD {
    public static int[] rotateArrayByD(int arr[],int n,int d){
        d = d % n;
        int[] temp=new int[n];


        for(int i=0;i<n-d;i++){
            temp[i]=arr[d+i];
        }
        for(int i=0;i<d;i++){
            temp[n-d+i]=arr[i];

        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
        return arr;
    }
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        int d=sc.nextInt();
        int[] ints = rotateArrayByD(arr, n, d);
        for(int i = 0; i < n; i++){
            System.out.print(ints[i] + " ");
        }
    }
}
