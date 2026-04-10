package Numbers;

public class CheckPrime {
    public static void main(String []args){
        int n=59;
        boolean isPrime=true;
        if(n<=1){
            isPrime= false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }

    }
}
