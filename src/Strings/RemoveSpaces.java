package Strings;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str="Hello World what is your problem";
        String result="";
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if (ch != ' '){
                result=result+ch;

            }
        }
        System.out.println(result);

    }
}
