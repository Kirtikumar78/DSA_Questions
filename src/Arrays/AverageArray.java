package Arrays;

public class AverageArray {
    public static void main(String[] args) {
        int arr[]={11,22,37,42,52,61};
        double sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum/arr.length);
    }
}
