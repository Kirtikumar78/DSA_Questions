import java.util.HashSet;

public class IntersectionOfArray {
    public static HashSet<Integer> Intersection(int arr[], int brr[]){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for (int i=0;i<arr.length;i++){
            set1.add(arr[i]);
        }
        for (int i=0;i< brr.length;i++){
            if (set1.contains(brr[i])){
                result.add(brr[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[]={8,9,7,9,7,5,4,2,3,5};
        int brr[]={3,4,5,6,7,8,9};

        HashSet<Integer> intersection = Intersection(arr, brr);

        System.out.println("Intersection:");
        for (int num : intersection) {
            System.out.print(num + " ");
        }


    }
}
