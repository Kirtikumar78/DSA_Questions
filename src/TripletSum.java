public class TripletSum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int sum=8;
        for (int i=0;i<arr.length;i++){
            int element1=arr[i];
            for (int j=i+1;j< arr.length;j++){
                int element2=arr[j];
                for (int k=j+1;k< arr.length;k++){
                    int element3=arr[k];
                    if (element1+element2+element3==sum){
                        System.out.println(element1+" "+element2+" "+arr[k]);
                    }
                }
            }
        }
    }
}
