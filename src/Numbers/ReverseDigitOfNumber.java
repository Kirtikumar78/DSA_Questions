package Numbers;
public class ReverseDigitOfNumber {
    public static void main(String[]args){
        int n=9292;
        int newNum=0;
        while(n>0){
            int digit=n%10;
             newNum=newNum*10+digit;
            n=n/10;
        }
        System.out.println(newNum);

    }
}
