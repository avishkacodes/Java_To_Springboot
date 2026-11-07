package L4;
public class SumLoop {

    static void main() {

//        For loop
        int sum1 = 0;

        for(int i1 = 0; i1 <= 4; i1++)
        {
            sum1+=i1;
        }

        System.out.print("For loop:" + sum1);

//        While loop

        int sum2 =0;
        int i2=0;

        while(i2<=4)
        {
            sum2+=i2;
            i2++;
        }

        System.out.print("\n While loop : " + sum2);

//        do...while loop

        int sum3 =0;
        int i3=0;

        do {
            sum3+=i3;
            i3++;
        } while(i3<=4);

        System.out.print("\n Do..While: " + sum3);




    }
}
