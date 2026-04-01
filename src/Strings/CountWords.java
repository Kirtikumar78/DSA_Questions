package Strings;

public class CountWords {
    public static int countWords(String str){
        String []words=str.split(" ");


        return words.length;
    }
    public static void main(String[]args){
        String str="count how many words in a string";
        int result=countWords(str);
        System.out.println(result);
    }
}
