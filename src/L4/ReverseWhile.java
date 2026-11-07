package L4;

public class ReverseWhile {

    public static void main() {

        int n = 56789;
        int ans = 0;

        while(n>0)
        {
            int rem = n % 10;
            ans = ans * 10 + rem;
            n = n/10;
        }

        System.out.println(ans);


    }
}
