package Arrays;

import java.util.Arrays;

public class MedianOfArray {
    public static int[] bubbleSort(int[] arr, int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        return arr;

    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9,10};



        int n = arr.length;
        int [] ints = bubbleSort(arr, n);
        double median;

        if(n % 2 == 0){
             median = (ints[n/2 - 1] + ints[n/2]) / 2.0;
            System.out.println("Median = " + median);
        }
        else{
             median = ints[n/2];
            System.out.println("Median = " + median);
        }
    }
}