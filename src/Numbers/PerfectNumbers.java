package Numbers;

public class PerfectNumbers {
    public static boolean perfectNumber(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }

        }
        if(sum==n){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[]args){
        int n=28;
        boolean b = perfectNumber(n);
        System.out.println(b);


    }
}
