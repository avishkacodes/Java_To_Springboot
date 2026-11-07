package L4;

import java.util.Scanner;

public class ReverseForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to Reverse : ");
        int n = sc.nextInt();
        int i =n;
        int ans = 0;

         for(i=n; i>0; i=i/10)
         {
             int rem = i % 10;
             ans = ans * 10 + rem;
         }

        System.out.println(ans);
    }
}
