package Strings;

public class RemoveCharacters {
    public static void main(String[] args) {
        String str="Hell#% skdj&&lsdkfj";
        String result="";
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);


            if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z')){
                result=result+ch;
            }
        }
        System.out.println(result);
    }
}
