package Lesson5.HomeWorkSeptember11;

/*
    Поиск минимального элемента массива с помощью сортировки и без
 */
public class ArrayFounder {

    public static void main (String[] args) {
        int[] arrayNumbers = {2, 8, 5, -20, 5, 1,};
        System.out.print("WithOutSort " + minArrayWithoutSort(arrayNumbers));
        System.out.println();
        System.out.print("WithSort " +  minArrayWithSort(arrayNumbers));


    }

    private static int minArrayWithSort(int[] array) {
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
        return array[0];
    }
    private static int minArrayWithoutSort(int[] array){
        int min = array[0];
                for (int i = 0 + 1; i < array.length; i++)
            if (array[i] < min) {
                min = array[i];



            }
        return min;

    }







}




