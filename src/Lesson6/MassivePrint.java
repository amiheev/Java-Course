package Lesson6;

import java.util.Random;

/*      43. Дано вещественное число B, целое число N и массив из N целых чисел,

        упорядоченных по возрастанию. Вывести элементы массива вместе с числом B,

        сохраняя упорядоченность выводимых чисел.
 */
public class MassivePrint {
    public static void main(String[] args){
        Random random = new Random();
        int[] array = new int[10];
        double b = 6.2;
        for (int i = 0; i < array.length; i++){
                array[i] = random.nextInt(10);
            }
        sort(array);


        insertDouble(array, b);

    }

    public static void insertDouble(int[] array, double b) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < b ) {
                System.out.println(array[i]);
            }else if (array[i-1] <  b ) {
                System.out.println(b);
                System.out.println(array[i]);
            }else System.out.println(array[i]);
        }
        if (b >= array[9]){
            System.out.println(b);
        }
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }

            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }





}
