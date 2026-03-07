package Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8,9,9};
        int start=arr[0];
        int end =arr.length-1;
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=arr[start];
            start++;
            end--;


        }
        System.out.println(arr);


    }
}
