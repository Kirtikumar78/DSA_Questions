package Strings;

import java.util.HashMap;
import java.util.Scanner;

public class MaximumOccurringCharacter {
    public static HashMap<Character, Integer> countFrequency(String str){
        HashMap<Character,Integer>map=new HashMap<>();
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
    public static void main(String[]agrs){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashMap<Character,Integer> map=countFrequency(str);
        char maxChar=' ';
        int maxCount=0;
        for(char key:map.keySet()){
            if (map.get(key) > maxCount) {
                maxCount=map.get(key);
                maxChar=key;
            }
        }

        System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("Frequency: " + maxCount);

    }
}
