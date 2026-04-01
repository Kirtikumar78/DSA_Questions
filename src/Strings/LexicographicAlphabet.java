package Strings;

public class LexicographicAlphabet {
    public static String lexicographicAlphabet(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='z')
                result=result+'a';
            else if(ch=='Z')
                result=result+'Z';
            else {
                result=result+(char)(ch+1);
            }

        }
        return result;
    }
    public static void main(String[]args){
        String str="abcdefgz";
        String s = lexicographicAlphabet(str);
        System.out.println(s);
    }
}
