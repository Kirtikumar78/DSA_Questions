package TcsPyq;

import java.util.Scanner;

public class MaximumProduct {
    public static int maximumProduct(int arr[],int n){
        int sum=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]>0&&arr[i+1]>0){
                sum=sum+arr[i]*arr[i+1];
            }
        }

        return sum;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i = maximumProduct(arr, n);
        System.out.println(i);


    }
}
