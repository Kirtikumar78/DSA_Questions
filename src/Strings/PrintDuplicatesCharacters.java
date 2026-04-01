package Strings;

import java.util.HashMap;

public class PrintDuplicatesCharacters {
    public static HashMap<Character,Integer> printDuplicates(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        return map;

    }
    public static void main(String[]args){
        String str="kirti";

        HashMap<Character,Integer>map=printDuplicates(str);
        for(char key:map.keySet()){
            if(map.get(key)>1){
                System.out.println(key);
            }

        }

    }
}
