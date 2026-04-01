package Strings;

public class LargestWord {
    public static String largestWord(String str){
        String []words=str.split(" ");
        String max="";
        for(int i=0;i<words.length;i++){
            if(words[i].length()>max.length()){
                max=words[i];

            }

        }
        return max;
    }
    public static void main(String[]args){
        String str="Google doc is here then wy fear my friends";
        String s = largestWord(str);
        System.out.println(s);
    }
}
