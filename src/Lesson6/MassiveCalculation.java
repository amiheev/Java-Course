package Lesson6;

import java.util.Random;

/*
        38. Дан массив из десяти целых чисел. Найти их сумму.

        39. Дан массив из десяти целых чисел. Найти их произведение.

        40. Дан массив из десяти целых чисел. Найти их среднее арифметическое.

        41. Дано целое число K и массив из десяти целых ненулевых чисел. Вывести

        номер первого числа в массиве, большего K. Если таких чисел нет, то

        вывести 0.

        42. Дано целое число K и массив из десяти целых ненулевых чисел. Вывести

        номер последнего числа в массиве, большего K. Если таких чисел нет, то

        вывести 0.
        47. Дан массив из N целых чисел. Найти их сумму. Расчет суммы массива

        реализовать в виде функции.

        48. Дан массив из N целых чисел. Найти их произведение. Расчет

        произведения массива реализовать в виде функции.

        49. Дан массив из N целых чисел. Найти их среднее арифметическое. Расчет

        среднего арифметического массива реализовать в виде функции.

        50. Дано 3 числа. Написать функцию, которая вычисляет сумму квадратов

        двух больших из этих трех чисел.
 */
public class MassiveCalculation {
    static Random random = new Random();
    public static void main(String[] args){
        long[] myArray = new long[10];
        //Random random = new Random();
        for (int i = 0; i<myArray.length; i++){
            int num = random.nextInt(100);
            if (num == 0){
                myArray[i] = num+1;
            }myArray[i] = num;

        }
        System.out.println("Array sum = " + arraySum(myArray));
        System.out.println("Array multiply = " + arrayMultiply(myArray));
        System.out.println("Array average = " + arrayAverage(myArray));
        System.out.println(moreThenNum(myArray));
        System.out.println(moreThenNumReverse(myArray));
        sum();
    }

    public static long arraySum(long[] array){
        long sum = 0;
        for (int i = 0; i < array.length; i++){
            sum+=array[i];
        }
        return sum;
    }

    public static long arrayMultiply(long[] array){
        long multiply = 1;
        for (int i = 0; i < array.length; i++){
            multiply*=array[i];
        }
        return multiply;
    }

    public static long arrayAverage(long[] array){
        long multiply = arraySum(array) / 2;
        return multiply;

    }

    public static long moreThenNum(long[] array){
        int k = random.nextInt(150);
        long number = 0;
        if (k != 0){
            for (int i = 0; i < array.length; i++){
                if (array[i] > k){
                    number=array[i];
                    break;
                }
        }


        }
        return number;
    }

    public static long moreThenNumReverse(long[] array){
        Random random = new Random();
        int k = random.nextInt(150);
        long number = 0;
        if (k != 0){
            for (int i = array.length-1; i >= 0; i--){
                if (array[i] > k){
                    number=array[i];
                    break;
                }
            }


        }
        return number;
    }

    public static void sum(){
        int sum;
        int [] array = new int[3];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(50);
        }
        MassivePrint.sort(array);
        /*for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }

            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;*/

        sum=(array[1] * array[1]) + (array[2] * array[2]);
        System.out.println("Сумма квадратов 2 больших чисел = " + sum);



    }




}
