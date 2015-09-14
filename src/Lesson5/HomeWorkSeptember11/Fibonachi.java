package Lesson5.HomeWorkSeptember11;

import java.util.ArrayList;
import java.util.List;

/*
    32. Дано целое число N (> 1). Последовательность чисел Фибоначчи FK (целого типа) определяется следующим образом: F1 = 1, F2 = 1, FK = FK–2 +

    FK–1, K = 3, 4, ... . Вывести элементы F1, F2, ..., FN.
 */
public class Fibonachi {

    public static void main(String[] args) {
        System.out.println(fib(33));

    }

    public static List<Integer> fib(int number){
        List<Integer> massive = new ArrayList<>();
        for (int  i = 0; i < number; i++){
            massive.add(fibonachi(i));
        }
        return massive;
    }

    public static Integer fibonachi(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else if (number == 2) {
            return 1;
        } else {
            return fibonachi(number - 1) + fibonachi(number -2);
            }

        }

}
