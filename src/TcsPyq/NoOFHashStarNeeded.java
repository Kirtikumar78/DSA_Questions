package TcsPyq;
import java.util.Scanner;
public class NoOFHashStarNeeded {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int hash=0;
        int star=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                star++;
            }
            else if(s.charAt(i)=='#'){
                hash++;
            }
        }
    System.out.println(star-hash);
    }

}
