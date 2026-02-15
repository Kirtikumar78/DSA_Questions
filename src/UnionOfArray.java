import java.util.HashSet;

public class UnionOfArray {
    public static void main(String[] args) {
        int arr[]={8,9,7,9,7,5,4,2,3,5};
        int brr[]={3,4,5,6,7,8,9};
        HashSet<Integer> integers = new HashSet<>();  //for sorted output use TreeSet

        for (int i=0;i<arr.length;i++){
            integers.add(arr[i]);
        }

        for (int i=0;i<brr.length;i++){
            integers.add(brr[i]);
        }

        System.out.println("Union of array");
        System.out.println(integers);
    }
}
