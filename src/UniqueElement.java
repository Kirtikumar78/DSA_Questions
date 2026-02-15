import java.util.Scanner;

public class UniqueElement {

    public static int UniqueElement(int arr[]){
        int ans=0;
        for (int i=0;i<arr.length;i++){
            ans=ans^arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the numbers");
        int arr[]=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int result = UniqueElement(arr);
        System.out.println("Unique element is "+result);
    }
}
