package Arrays;

public class SmallestNum {


    public static int smallestNum(int arr[]){
        int min=arr[0];


        for (int i=1;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[]={88,2,3,4,5,6,7,4,5,6};
        int result=smallestNum(arr);
        System.out.println(result);

    }
}
