package Strings;

public class RemoveCharacters {
    public static void main(String[] args) {
        String str="Hello4$554664 World what is your problem";
        String result="";
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if ((ch >= 'a' && ch <= 'z') ||
                    (ch >= 'A' && ch <= 'Z')){
                result=result+ch;

            }
        }
        System.out.println(result);
    }
}
