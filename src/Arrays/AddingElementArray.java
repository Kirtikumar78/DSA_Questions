package Arrays;

import java.util.Scanner;

public class AddingElementArray {
    public static int insertBeginning(int arr[],int n,int x){
        for(int i=n-1;i>=0;i--){
            arr[i+1]=arr[i];


        }
        arr[0]=x;
        return n+1;
    }
    public static int insertEnding(int arr[],int n,int x){

        arr[n]=x;
        return n+1;
    }
    public static int insertAtSpecificLocation(int arr[],int n,int x,int y){
        for(int i=n-1;i>=y-1;i--){
            arr[i+1]=arr[i];
        }
        arr[y-1]=x;
        return n+1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();
//        System.out.print("Which element you have to insert at the beginning : ");
//        int x=sc.nextInt();
        System.out.print("Which element you have to insert  : ");
        int x=sc.nextInt();
        System.out.print("at which position  : ");
        int y=sc.nextInt();
        int arr[]=new int[n+1];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        int result=insertBeginning(arr,n,x);
//        for(int i=0;i<result;i++){
//            System.out.print(arr[i]+" ");
//        }
//        int result1=insertEnding(arr,n,x);
//        for(int i=0;i<result1;i++){
//            System.out.print(arr[i]+" ");
//        }
        int result1=insertAtSpecificLocation(arr,n,x,y);
        for(int i=0;i<result1;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
