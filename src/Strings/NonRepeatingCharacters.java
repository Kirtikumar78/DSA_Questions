package Strings;

import java.util.HashMap;

public class NonRepeatingCharacters {

    public static void main(String args[]){
        String str="hello";

//        for(int i=0;i<str.length();i++){
//            int count=0;
//            char ch=str.charAt(i);
//            for(int j=0;j<str.length();j++){
//
//                if(ch==str.charAt(j)){
//                    count++;
//                }
//            }
//            if(count==1){
//                System.out.print(ch);
//            }
//
//        }




        //Method 2
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
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(map.get(ch)==1){
                System.out.print(ch);
            }
        }

    }
}
