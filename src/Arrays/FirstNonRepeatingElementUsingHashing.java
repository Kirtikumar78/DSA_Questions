package Arrays;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class FirstNonRepeatingElementUsingHashing {
    public static int FirstRepeatElement(int arr[],int n){
        Map<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<n;i++){
            if(m.containsKey(arr[i])){
                m.put(arr[i],m.get(arr[i])+1);
            }
            else{
                m.put(arr[i],1);
            }

        }
        for(int i=0;i<n;i++){
            if(m.get(arr[i])==1){
                return arr[i];
            }

        }
        return -1;
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = FirstRepeatElement(arr, n);

        if (result != -1) {
            System.out.println("First non repeating element: " + result);
        } else {
            System.out.println("No non repeating element found");
        }
    }

}
