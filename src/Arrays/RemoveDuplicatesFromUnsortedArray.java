package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesFromUnsortedArray {

//    public static int[] bubbleSort(int arr[],int n){
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<n-1-i;j++){
//                if(arr[j]<arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        return arr;
//    }
    public static int removeDuplicates(int arr[],int n){

        HashSet<Integer> set=new HashSet<>();
        int k=0;
        for(int i=0;i<n;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                arr[k]=arr[i];
                k++;
            }
        }
        return k;


    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int newNums=removeDuplicates(arr,n);

        for(int i=0;i<newNums;i++){
            System.out.println(arr[i]+" ");
        }

    }
}
