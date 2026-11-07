package L4;

import java.util.Scanner;

public class Reverse {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to Reverse : ");
        int n = sc.nextInt();
        int i =n;
        int ans = 0;

         for(i=n;i>n;i++)
         {
             int rem = i % 10;
             ans = ans * 10 + rem;
             i = i/10;
         }

        System.out.println(ans);
    }
}
