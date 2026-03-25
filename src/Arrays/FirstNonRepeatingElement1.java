package Arrays;

import java.util.*;
public class FirstNonRepeatingElement1 {
    public static int nonRepeatElement(int arr[],int n){
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                return arr[i];
            }
        }
        return-1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter array element");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result = nonRepeatElement(arr, n);
        if(result != -1) {
            System.out.println("First non repeating element: " + result);
        } else {
            System.out.println("No non repeating element found");
        }
    }
}
