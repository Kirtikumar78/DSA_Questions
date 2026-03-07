package Arrays;

import java.util.HashMap;

public class FrequencyArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,32,1,1,1,1,1,1,1,1,1,2,4,5,4,3};
        HashMap<Integer,Integer>hm=new HashMap<>();
        for (int i=0;i<arr.length;i++)
        {
            if (hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else {
                hm.put(arr[i],1);
            }
        }
        System.out.println(hm);
    }
}
