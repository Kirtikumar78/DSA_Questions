package TcsPyq;

import java.util.HashMap;

public class Frequency {
    public static int highestFrequency(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int max=0;
        int result=-1;
        for(Integer key:map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
                result = key;
            }
        }



        return result;

    }


    public static void main(String args[]){
        int arr[]={1,2,3,4,5,3,23,2,32,2};
        int i = highestFrequency(arr);
        System.out.println(i);

    }
}
