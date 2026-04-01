package Strings;

import java.util.HashSet;

public class RemoveCharsFromFirstString {
    public static String removeCharacter(String str1,String str2){
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            set.add(ch);
        }
        String result="";
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            if(!set.contains(ch)){
                result=result+ch;

            }
        }
        return result;
    }
    public static void main(String[]args){
        String str1="kirti";
        String str2="kumar";
        String s = removeCharacter(str1, str2);
        System.out.println(s);


    }
}
