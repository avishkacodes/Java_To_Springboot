package L3;

import java.util.Scanner;

public class LeapYearSwitch {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<10;i++) {
            System.out.print("Enter the year : ");
            int year = sc.nextInt();

            switch ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                case true:
                    System.out.println("Leay year");
                    break;
                case false:
                    System.out.println("Not a Leap year");
                    break;
            }
        }
    }
}
