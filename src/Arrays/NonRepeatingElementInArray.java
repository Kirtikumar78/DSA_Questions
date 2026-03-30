package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class NonRepeatingElementInArray {
    public static void NonRepeatingElements(int arr[],int n){
//        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.print("Enter array element : ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        NonRepeatingElements(arr,n);



    }
}
