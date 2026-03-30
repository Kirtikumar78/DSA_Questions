package TcsPyq;

import java.util.Scanner;

public class NumGreaterThanPivotNo {

    public static int greaterElements(int arr[],int n){
        int result=1;
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                result++;
                max=arr[i];
            }
        }
        return result;
    }
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i = greaterElements(arr, n);
        System.out.print(i);
    }
}
