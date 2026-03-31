package Strings;

public class CheckAnagrams {
    public static boolean checkAnagram(String str1,String str2){
        int arr[]=new int [26];
        if(str1.length()!=str2.length())
            return false;


        for(int i=0;i<str1.length();i++){
            arr[str1.charAt(i)-'A']++;
            arr[str2.charAt(i)-'A']--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String []args){
        String str1="ANAGRAM";
        String str2="NAGARAM";
        boolean b = checkAnagram(str1, str2);
        System.out.println(b);
    }
}
