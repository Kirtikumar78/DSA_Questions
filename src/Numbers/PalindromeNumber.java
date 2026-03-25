package Numbers;


import java.util.Scanner;

public class PalindromeNumber {
    //121
    public static boolean checkPalindrome(int num){
        int original=num;
        int reverse=0;
        while (num>0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        if (original==reverse)
            return true;
        else return false;
    }
    public static boolean check(int num){
        String str=String.valueOf(num);
        int start=0;
        int end=str.length()-1;
        boolean isPalindrome=true;

//        while(start<end){
//            if(str.charAt(start)==str.charAt(end)){
//                start++;
//                end--;
//
//            }
//            else{
//                isPalindrome=false;
//                break;
//
//            }
//
//        }

        while(num>0){
            int sub=num%10;
            int divide=num/10;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        boolean result=check(num);
        if(result){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not Palindrome");
        }
//        boolean result=checkPalindrome(num);
//        System.out.println(result);


    }
}
