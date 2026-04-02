package Strings;

public class ReverseWordsInString {
    public static String reverseWords(String str){
        String[]words =str.split(" ");
        int start=0;
        int end=words.length - 1;
        String result="";
        while(start<end){
            String temp=words[start];
            words[start]=words[end];
            words[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<words.length;i++){
            result=result+words[i]+" ";
        }
        return result.trim();
    }
    public static void main(String []args){
        String str="hello this is my world";
        String result=reverseWords(str);
        System.out.println(result);


    }
}
