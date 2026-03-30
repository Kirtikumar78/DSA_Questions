package Strings;

import java.util.Scanner;

public class CapitalizeFirstLast {
    public static String CapitalizeFirstLastWord(String str){
        String words[]=str.split(" ");
        String result="";
        for(int i=0;i<words.length;i++){
            String word=words[i];
            if(word.length()==0){

            }
            else{
                char first=Character.toUpperCase(word.charAt(0));
                char last=Character.toUpperCase(word.charAt(word.length()-1));
                String middle=word.substring(1,word.length()-1);
                result=result+first+middle+last+" ";

            }
        }
        return result.trim();
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        String str=CapitalizeFirstLastWord(sentence);
        System.out.println(str);

    }
}
//    String []words=str.split(" ");
//    String result="";
//        for(int i=0;i<words.length;i++){
//        String word=words[i];
//        if(word.length()==0){
//        result=result+Character.toUpperCase(word.charAt(0))+" ";
//
//        }
//        else{
//        char first=Character.toUpperCase(word.charAt(0));
//        char last=Character.toUpperCase(word.charAt(word.length()-1));
//        String middle=word.substring(1,word.length()-1);
//        result=result+first+middle+last+" ";
//
//        }
//        }