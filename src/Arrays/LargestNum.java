package Arrays;

public class LargestNum {
    public static int largestNum(int arr[]){
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={88,2,3,4,5,6,7,4,577,6};
        int result=largestNum(arr);
        System.out.println(result);

    }
}
