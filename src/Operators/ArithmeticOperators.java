package Operators;

import java.util.Scanner;

public class ArithmeticOperators {

    public static void main(String[] args) {

        //ArithmeticOperators
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        float a = sc.nextFloat();

        System.out.print("Enter Second Number : ");
        float b = sc.nextFloat();

        //operations to be performed:

        System.out.println("a + b = "+ (a+b));

        System.out.println("a - b = "+ (a-b));

        System.out.println("a * b = "+ (a*b));

        System.out.println("a / b = "+ (a/b));

        System.out.println("a % b = "+ (a%b));

    }
}
