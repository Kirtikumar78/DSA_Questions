package Arrays;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int arr[]={2,5,7,4,6,8,4,3,5,7,8,8,6};
        Arrays.sort(arr);
        int n=arr.length;
        int mid=(n+1)/2;
        for (int i=0;i<mid;i++){
            System.out.print(arr[i]+" ");

        }
        for(int i=n-1;i>=mid;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
