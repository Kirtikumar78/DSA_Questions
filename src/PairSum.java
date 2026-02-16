public class PairSum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int sum=7;
        for (int i=0;i<arr.length;i++){
            int element=arr[i];
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]+element==sum){
                    System.out.println(element+" "+arr[j]);
                }
            }
        }
    }
}
