package Lesson5.HomeWorkSeptember11;

/*
        33. Начальный вклад в банке равен 1000 руб. Через каждый месяц размер

        вклада увеличивается на P процентов от имеющейся суммы (P — вещественное

        число, 0 < P < 25). По данному P определить, через сколько месяцев размер

        вклада превысит 1100 руб., и вывести найденное количество месяцев K

        (целое число) и итоговый размер вклада S (вещественное число).
 */
public class Bank {
    public static void  main (String[] args){
        depositCalculation(0.1);
    }

    private static void depositCalculation(double p){
        double sum = 1000;
        double x = 0;
        int month = 0;

        while (sum < 1100){
           x += (sum / 100 * p);
           sum+=x;
            month++;

        }
        System.out.println("after " + month + " month deposit will be " + sum  + " rub");

    }
}
