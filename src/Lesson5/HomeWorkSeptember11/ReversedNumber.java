package Lesson5.HomeWorkSeptember11;

/*
  34. Дано целое число N (> 0). Используя операции деления нацело и взятия

    остатка от деления, вывести все его цифры, начиная с самой правой

    (разряда единиц).
 */
public class ReversedNumber {
    public static void main(String[] args){
        reverse(13221113);
    }

    private static void reverse(int n){
        System.out.print(n +  " число наоборот ");
        while (n / 10 != 0){
            System.out.print(n % 10);
            n /= 10;
        }
        System.out.print(n);
    }
}
