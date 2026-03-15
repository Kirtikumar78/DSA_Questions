package Numbers;

import java.util.Scanner;
public class FindAllPalindromeInRange {

    public static boolean check(int num){
        String str=String.valueOf(num);
        int start=0;
        int end=str.length()-1;
        boolean isPalindrome=true;

        while(start<end){
            if(str.charAt(start)==str.charAt(end)){
                start++;
                end--;

            }
            else{
                isPalindrome=false;
                break;

            }

        }
        return isPalindrome;
    }
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int min =sc.nextInt();
        int max =sc.nextInt();
        for(int i=min;i<max;i++){
            if(check(i)){
                System.out.print(i+" ");
            }
        }


    }
}
