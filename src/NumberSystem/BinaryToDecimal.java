package NumberSystem;

public class BinaryToDecimal {

    public static int binaryToDecimal(String str){
        int decimal=0;
        int power=0;
        for(int i=str.length()-1;i>=0;i--){
            int digit=str.charAt(i)-'0';
            decimal =( int) (decimal+ digit * Math.pow(2, power));
            power++;

        }
        return decimal;
    }
    public static void main (String[]args){
        String str="1100";
        int i = binaryToDecimal(str);
        System.out.println(i);

    }
}
