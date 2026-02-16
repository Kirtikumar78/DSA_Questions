public class MoveAllNegativeLeft {

    public static void moveAllNegativeLeft(int arr[]){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            if (arr[start]<0){
                start++;

            }
            else if (arr[end]>0){
                end--;
            }
            else {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,-3,-4,3,-4,4,4,2,-2};
        moveAllNegativeLeft(arr);
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
