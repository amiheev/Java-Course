package Lesson5.HomeWorkSeptember11;

/*
           37. Given a positive integer, N, define the ’3N+1’ sequence starting
        from N as follows: If N is an even number, then divide N by two; but if N
        is odd, then multiply N by 3 and add 1. Continue to generate numbers in
        this way until N becomes equal to 1. For example, starting from N = 3,
        which is odd, we multiply by 3 and add 1, giving N = 3*3+1 = 10. Then,
        since N is even, we divide by 2, giving N = 10/2 = 5. We continue in this
        way, stopping when we reach 1, giving the complete sequence: 3, 10, 5,
        16, 8, 4, 2, 1. Write a program that will read a positive integer from
        the user and will print out the 3N+1 sequence starting from that integer.
        The program should also count and print out the number of terms in the
        sequence.
 */
public class PositiveNumber {
    public static void main (String [] args) {
        positiveInt(5);
    }

    private static int positiveInt (int num){
        System.out.print(num);
        System.out.println(" изначальное число");
        while (num != 1)
        if (num % 2 == 0){
            num /= 2;
            System.out.print(num);
            System.out.println("");
        } else{
            num = (num * 3) +1;
            System.out.print(num);
            System.out.println("");
        }
        return num;
    }


}
