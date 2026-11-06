package L3;

import java.util.Scanner;

public class EvenOddSwitch {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the Number to check if it is Even or Odd : ");
        int number = sc.nextInt();

        switch(number%2)
        {
            case 0:
                System.out.print(number + ":" + " is an Even number.");
                break;
            case 1:
            case -1:
                System.out.print(number + ":" + " is an Odd number.");
                break;

            default:
                System.out.print("Please enter a Number");
                break;
        }

    }

}
