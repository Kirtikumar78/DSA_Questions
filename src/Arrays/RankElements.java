package Arrays;
import java.util.Scanner;
public class RankElements {
    public static int[] bubbleSort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        return arr;
    }
    public static int[] rankElements(int arr[],int n){
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        return arr;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sort[]=bubbleSort(arr,n);
        int result[]=rankElements(sort,n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
