package Lesson4;

/**
 * Created by Alexey on 11.09.2015.
 */
public class Reverse {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        for (int i =0; i < myArray.length; i++){
            myArray[i] = (int)(Math.random() * 100);
            System.out.println(myArray[i]);
        }
        System.out.println("----------- Reversed Array :----------- ");
        for (int i = 0; i < myArray.length; i++){
            System.out.println(+ myArray[10 - i - 1]);
        }
    }

}
