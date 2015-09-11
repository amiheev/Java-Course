package Lesson4;

/**
 * Created by Alexey on 11.09.2015.
 */
public class Shuffle {
    public static void main(String[] args) {
        int[] cards = new int [5];
        System.out.println("Before Lesson4.Shuffle");
        for (int i = 0; i < cards.length; i++) {
            cards[i] = (int)(Math.random() * 32);
            System.out.println(cards[i]);
        }
        System.out.println("After Lesson4.Shuffle");
        for (int i = cards.length -1; i >= 0; i--) {
            /*Random rand = new Random();
            int randGenerator = rand.nextInt(i+1);*/
            int randGenerator =(int)(Math.random() * i);
            int a = cards[randGenerator];
            cards[randGenerator] = cards[i];
            cards[i] = a;
            System.out.println(cards[i]);




        }
    }
}
