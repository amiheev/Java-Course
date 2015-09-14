package Lesson5.HomeWorkSeptember11;


import java.util.List;

/**
 *   Дано целое число N (> 1). Последовательность чисел Фибоначчи FK

     определяется следующим образом: F1 = 1, F2 = 1, FK = FK–2 + FK–1, K = 3, 4, ...

     Проверить, является ли число N числом Фибоначчи. Если является, то

     вывести True, если нет — вывести False.
 */
public class FibonachiTest {
    public static void main (String[] args) {
        System.out.println(fibTest(45));

    }

    private static boolean fibTest(int num){
        boolean bool = true;
        List<Integer> s = Fibonachi.fib(num+1);

        for (int i = 1; i < s.size(); i++){
            if (s.get(i) ==  num){
                bool = true;
                break;
            }else {
                bool = false;
            }

        }
        return bool;
    }
}
