package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class FindSymmetricPairs {
    public static void symmetricPairs(int arr[][]){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int first=arr[i][0];
            int second=arr[i][1];
            if(map.containsKey(second)&& map.get(second)==first){
                System.out.println("("+first+","+second+")");
            }
            else{
                map.put(first,second);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of pairs");
        int n=sc.nextInt();
        int arr[][]=new int [n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        symmetricPairs(arr);


    }
}
