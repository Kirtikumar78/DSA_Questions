public class SetKthBit {

    public static int setBit(int N,int K){
            int mask=1<<K;
            int ans=N|mask;
            return ans;

    }
    public static void main(String[] args) {
        System.out.println(setBit(13,1));
    }
}
