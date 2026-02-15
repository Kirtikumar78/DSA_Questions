public class ReverseInteger {

    public static int reverse(int x){
        int ans=0;
        int rem=0;
        boolean isNeg=false;
        if (x<0){
            isNeg=true;
            x=-x;
        }
        while (x>0){
            int digit=x%10;
            ans=ans*10+digit;
            x=x/10;

        }
        return isNeg ? -ans : ans;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));     // 321
        System.out.println(reverse(- 123));     // 321


    }
}
