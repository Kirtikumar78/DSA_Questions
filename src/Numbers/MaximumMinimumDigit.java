package Numbers;

public class MaximumMinimumDigit {
    public static void main(String[]args){
        int n=23273;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(n>0){
            int digit=n%10;
            if(digit>max){
                max=digit;
            }
            if(digit<min){
                min=digit;
            }
            n = n / 10;
        }
        System.out.println(max);
        System.out.println(min);

    }
}
