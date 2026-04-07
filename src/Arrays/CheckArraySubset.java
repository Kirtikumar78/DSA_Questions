package Arrays;

import java.util.HashSet;

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
    public static boolean checkSubsetUsingHashSet(int arr1[],int arr2[]){

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);

        }
        for(int j=0;j<arr1.length;j++){
            boolean found =false;
            if(set.contains(arr1[j])){
                found =true;
                //break;
            }
            if(!found) return false;
        }
        return true;

    }
    public static void main(String []args){
        int arr1[]={1,3,4,43};
        int arr2[]={2,4,3,1,7,5};
        boolean b = checkSubsetUsingHashSet(arr1, arr2);
        System.out.println(b);


    }
}
