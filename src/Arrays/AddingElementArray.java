package Arrays;

import java.util.Scanner;

public class AddingElementArray {

    public static int insertBeginning(int arr[], int n, int x) {
        for (int i = n - 1; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = x;
        return n + 1;
    }

    public static int insertEnding(int arr[], int n, int x) {
        arr[n] = x;
        return n + 1;
    }

    public static int insertAtSpecificLocation(int arr[], int n, int x, int y) {
        for (int i = n - 1; i >= y - 1; i--) {
            arr[i + 1] = arr[i];
        }
        arr[y - 1] = x;
        return n + 1;
    }

    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr1[] = new int[n + 1];
        int arr2[] = new int[n + 1];
        int arr3[] = new int[n + 1];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            arr1[i] = val;
            arr2[i] = val;
            arr3[i] = val;
        }

        System.out.print("Enter element to insert: ");
        int x = sc.nextInt();

        System.out.print("Enter position: ");
        int y = sc.nextInt();

//        int res1 = insertBeginning(arr1, n, x);
//        printArray(arr1, res1);

        int res2 = insertEnding(arr2, n, x);
        printArray(arr2, res2);

//        int res3 = insertAtSpecificLocation(arr3, n, x, y);
//        printArray(arr3, res3);
    }
}