package L3;

import java.util.Scanner;

public class IsTriangleSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int A = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int B = sc.nextInt();
        System.out.print("Enter Third Number : ");
        int C = sc.nextInt();

//        Boolean IsValid = (A+B+C==180) && (A>0 && B>0 && C>0); //can use this method too...switch(IsValid)

        switch((A+B+C==180) && (A>0 && B>0 && C>0))
        {
            case true:
                System.out.print("vaild Triangle");
                break;
            case false:
                System.out.print("Invaild Traiangle");
                break;
        }

    }
}
