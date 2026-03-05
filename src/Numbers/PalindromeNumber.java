package Numbers;

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
    public static void main(String[] args) {
        int num=1233211;
        boolean result=checkPalindrome(num);
        System.out.println(result);

    }
}
