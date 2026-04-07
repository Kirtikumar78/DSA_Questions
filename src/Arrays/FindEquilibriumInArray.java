package Arrays;

public class FindEquilibriumInArray {
    public static int findEquilibrium(int arr[]){
        for(int i=0;i<arr.length;i++){
            int leftSum=0;
            int rightSum=0;
            for(int j=0;j<i;j++){
                leftSum=leftSum+arr[j];
            }
            for(int k=i+1;k<arr.length;k++){
                rightSum=rightSum+arr[k];
            }
            if(leftSum==rightSum){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int arr[]={1, -1, 4};
        int equilibrium = findEquilibrium(arr);
        System.out.println(equilibrium);
    }
}
