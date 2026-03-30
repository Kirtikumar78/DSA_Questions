package Strings;

import java.util.Scanner;

public class RemoveBrackets {
    public static String removeBrackets(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch!='('&& ch!=')')){
                result=result+ch;
            }

        }
        return result;
    }

    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        String s = removeBrackets(str);
        System.out.println(s);


    }
}
