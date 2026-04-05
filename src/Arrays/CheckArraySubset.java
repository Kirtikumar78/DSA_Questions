package Arrays;

public class CheckArraySubset {
    public static boolean checkSubset(int arr1[],int arr2[]){

        for(int i=0;i<arr1.length;i++){
            boolean found=false;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    found=true;
                    break;
                }
            }
            if(!found) return false;
        }
        return true;
    }
    public static void main(String []args){
        int arr1[]={1,3,4,5,2,7,8};
        int arr2[]={2,4,3,1,7,5,15};
        boolean b = checkSubset(arr1, arr2);
        System.out.println(b);


    }
}
