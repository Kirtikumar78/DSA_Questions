package Numbers;

public class LeapYear {
    public static void main(String[]args){
        int n=1995;
        if(n%400==0){
            System.out.println(" Leap year");
        }
        else if(n%4==0 && n%100!=0){
            System.out.println(" Leap year");
        }
        else {
            System.out.println("Not Leap year");
        }
    }
}
