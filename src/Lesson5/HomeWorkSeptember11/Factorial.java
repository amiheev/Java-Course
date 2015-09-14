package Lesson5.HomeWorkSeptember11;

/*
        31. Дано целое число N (> 0). Найти произведение N! = 1·2·...·N

        (N–факториал). Чтобы избежать целочисленного переполнения, вычислять это

        произведение с помощью вещественной переменной и вывести его как

        вещественное число.
 */
public class Factorial {
    public static void main (String[] args) {
        factorial(2);


    }
    private static double factorial (double number) {
        double factorial = number;
        if (number > 0){
        for (int i = 1; i < number; i++){
            factorial *= (number - i);
        }
        }


        return factorial;

    }
}
