package Arrays;

public class SecondLargestNum {
    public static void main(String[] args) {
        int arr[]={314,24,366,469,575,316,7};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];

            } else if (arr[i]>secondLargest) {
                secondLargest=arr[i];


            }

        }
        System.out.println(secondLargest);
    }
}
