package Strings;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void removeDuplicates(String str){
        HashSet <Character>set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
                System.out.print(ch);
            }

        }


    }
    public static void main(String[]args){
        String str="kirti";
        removeDuplicates(str);

    }

}
