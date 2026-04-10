package Numbers;

public class PrintNthPrimeNum {
    public static boolean isPrime(int num) {

        if (num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    public static int printNthPrimeNum(int n){

        int count=0;
        for(int i=0; ;i++){
            if(isPrime(i)){
                count++;
                if(count==n)
                    return i;

            }

        }

    }
    public static void main(String []args){

        int n=3;
        int i = printNthPrimeNum(n);
        System.out.println(i);
    }
}
