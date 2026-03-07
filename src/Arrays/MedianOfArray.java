package Arrays;

import java.util.Arrays;

public class MedianOfArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,4,6,7};
        Arrays.sort(arr);
        int n=arr.length;
        int mid=(n+1)/2;
        if (arr.length%2==0){
            System.out.println((mid+arr[mid]+1)/2);

        }else {
            System.out.println(arr[mid]);
        }
    }
}
