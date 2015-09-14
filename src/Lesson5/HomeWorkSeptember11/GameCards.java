package Lesson5.HomeWorkSeptember11;

/*
        23. Мастям игральных карт присвоены порядковые номера: 1 — пики, 2 — трефы, 3 — бубны, 4 — червы.
        Достоинству карт, старших десятки, присвоены номера: 11 — валет, 12 — дама, 13 — король, 14 — туз.
        Даны два целых числа: N — достоинство (6 ≤ N ≤ 14) и M — масть карты (1 ≤ M ≤ 4). Вывести название соответствующей карты вида «шестерка бубен»,
        «дама червей», «туз треф» и т. п.
 */
public class GameCards {
    public static void main (String[] args) {
        cardSelector(5, 14);

    }
    private static void cardSelector(int suitNumber, int cardValue) {
        String suit = "";
        String value = "";
        if (suitNumber < 1 || suitNumber > 4 || cardValue < 6 || cardValue > 14) {
            System.out.println("suit number can be in range between 1 - 4  and card number should be in range between 6 - 14");
        } else {
            switch (suitNumber) {
                case 1:
                    suit = "пики ";
                    break;
                case 2:
                    suit = "червей";
                    break;
                case 3:
                    suit = "тубен";
                    break;
                case 4:
                    suit = "треф";
                    break;

            }

            switch (cardValue) {
                case 6:
                    value = "Шестерка";
                    break;
                case 7:
                    value = "Семерка";
                    break;
                case 8:
                    value = "Восьмерка";
                    break;
                case 9:
                    value = "Девятка";
                    break;
                case 10:
                    value = "Десятка";
                    break;
                case 11:
                    value = "Валет";
                    break;
                case 12:
                    value = "Дама";
                    break;
                case 13:
                    value = "Король";
                    break;
                case 14:
                    value = "Туз";
                    break;

            }

            System.out.println(value + " " + suit);

        }
    }
}
