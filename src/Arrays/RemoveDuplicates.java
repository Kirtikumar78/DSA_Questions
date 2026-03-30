package Arrays;

import java.util.Scanner;

public class RemoveDuplicates {
    public static int removeDuplicates(int arr[],int n){
        int rd=0;
        for(int i=1;i<n;i++){
            if(arr[rd]!=arr[i]){
                rd++;
                arr[rd]=arr[i];
            }

        }
        return rd+1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int i1 = removeDuplicates(arr, n);//int result[]
        for(int i=0;i<i1;i++){
            System.out.println(arr[i]+" ");

        }


    }
}
