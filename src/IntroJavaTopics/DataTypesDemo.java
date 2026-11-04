package IntroJavaTopics;

import java.util.Scanner;


public class DataTypesDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Quantity : ");
        int Quantity = sc.nextInt();
        System.out.println("Quantity : " + Quantity);

        System.out.print("Enter the Weight : ");
        float weight = sc.nextFloat();
        System.out.println("Weight : " + weight);


    }
}
