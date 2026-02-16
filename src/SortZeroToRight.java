public class SortZeroToRight {
    public static void main(String[] args) {
        int arr[]={0,3,4,2,4,6,7,9,0,0,0,0,2,32,3,2};
        int start=0;
        int end=arr.length-1;

        while (start<end){
            if (arr[start]!=0){
                start++;
            }
            else if (arr[end]==0){
                end--;
            }
            else  {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
