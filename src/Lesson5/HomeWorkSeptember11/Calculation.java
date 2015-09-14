package Lesson5.HomeWorkSeptember11;

/*      27. Даны два целых числа A и B (A < B). Найти сумму всех целых чисел от

        A до B включительно.

        28. Даны два целых числа A и B (A < B). Найти произведение всех целых

        чисел от A до B включительно.

        29. Даны два целых числа A и B (A < B). Найти сумму квадратов всех целых

        чисел от A до B включительно.
*/
public class Calculation {
    public static void main(String[] args) {
        sumCalculation(5, 10);
        multiplicationCalculation(3, 5);
        exponentiationSum(3,5);


    }
    private static void sumCalculation(int a, int b) {
        int sum = 0;
        if (a < b){


        while (a < b) {
            sum =sum + a;
            a++;
        }
            System.out.println("Result =  " +  (sum + b));

        }else System.out.println("incorrect condition, because a >= b");


    }

    private static void multiplicationCalculation(int a, int b){
        int sum = 1;
        if (a < b){


            while (a < b) {
                sum =sum * a;
                a++;
            }
            System.out.println("Result =  " +  (sum * b));

        }else System.out.println("incorrect condition, because a >= b");


    }

    private static void exponentiationSum(int a, int b) {
        int sum = 0;
        if (a < b){
            while (a < b){
                sum=sum + (a*a);
                a++;
            }
            System.out.println("Result = " + (sum + (b*b)));
        }else System.out.println("incorrect condition, because a >= b");
    }
}
