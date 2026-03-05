package Strings;

public class SumOfNumInString {

    public static void SumNum(String str){
        int sum=0;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (Character.isDigit(ch)){
                sum=sum+ch-'0';
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        String str="a2s3r4e";
        SumNum(str);

    }
}
