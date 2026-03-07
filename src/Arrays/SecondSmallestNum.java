package Arrays;

public class SecondSmallestNum {
    public static void main(String[] args) {
        int arr[]={13,2,33,43,53,63,73};
        int min=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                secondMin=min;
                min=arr[i];
            }
            else if (arr[i]<secondMin){
                secondMin=arr[i];
            }
        }
        System.out.println(secondMin);
    }
}
