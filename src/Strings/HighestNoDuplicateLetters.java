package Strings;

import java.util.HashMap;

public class HighestNoDuplicateLetters {
    public static void duplicateLetters(String str){
        HashMap<Character,Integer>map=new HashMap<>();
        String[]words=str.split(" ");
        for(int j=0;j<words.length;j++){
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                }
                else{
                    map.put(ch,1);
                }

            }
            int max=0;
            for(Character key:map.keySet()){
                for(int i=0;i<key;i++){
                    if(map.get(key)>max){
                        max=map.get(key);
//                    System.out.println(key);
                    }
                }
                System.out.println(key);
            }


        }



    }
    public static void main(String []args){
        String str="ooooopppppp kkkkkkkkk";
        duplicateLetters(str);
    }
}
