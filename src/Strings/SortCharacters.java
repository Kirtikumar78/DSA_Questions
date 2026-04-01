package Strings;

public class SortCharacters {
    public static String sortCharacters(String str){
        char[]arr=str.toCharArray();
        for(int i=0;i<str.length()-1;i++){

            for(int j=0;j<str.length()-i-1;j++){

                if(arr[j]>arr[j+1]){
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        String ans =new String (arr);
        return ans;
    }
    public static void main(String[]args){
        String str="shjfhjsdhfaijgew";
        String s = sortCharacters(str);
        System.out.println(s);
    }

}
