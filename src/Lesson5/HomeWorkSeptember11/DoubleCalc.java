package Lesson5.HomeWorkSeptember11;

//30. Дано вещественное число A и целое число N (> 0). Используя один

//      цикл, найти значение выражения 1 – A + A2 – A3 + ... + (–1)N·AN. Условный

//       оператор не использовать.

public class DoubleCalc {
    public static void  main(String [] args){
        setParameters(2.2, 5);


    }
    private static double calculation(double a, int n){
        double a1 = a;
        for (int i = 1; i < n; i++){
            double sum = a * a1;
            a = sum;

        }
        return a;
    }

    private static void setParameters(double x, int y){
        double result = 1 - x + x*x - x*x*x + calculation(-1,y) * calculation(x,y);
        System.out.println(result);

    }

}
