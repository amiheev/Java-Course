package Lesson5.HomeWorkSeptember11;

/*
        35. Дано целое число N (> 1). Если оно является простым, то есть не

        имеет положительных делителей, кроме 1 и самого себя, то вывести True,

        иначе вывести False.
 */
public class Division {
    public static void main (String[] args) {
        System.out.println(number(15));

    }

    public static boolean number(int n){
        boolean num;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count <= 2) {
             num=true;
        }else  num=false;
        return num;
    }

}
