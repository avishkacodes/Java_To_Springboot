package L4;

public class ReverseDoWhile {
    public static void main(String[] args) {

        int n = 1234567;
        int ans = 0;

        do {
            int rem = n % 10;
            ans = ans * 10 + rem;
            n = n/10;
        } while(n>0);

        System.out.println(ans);


    }
}
