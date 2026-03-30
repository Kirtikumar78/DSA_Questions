package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class RepeatingElementInArray {
    public static void repeatingElements(int arr[],int n,HashSet set){
        for(int i=0;i<n;i++){
            if(set.contains(arr[i])){
                System.out.print(arr[i]+" ");
            }
            else{
                set.add(arr[i]);
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
        HashSet<Integer> set=new HashSet<>();
        repeatingElements(arr,n,set);
    }
}
