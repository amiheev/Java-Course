package Lesson5.HomeWorkSeptember11;

/*25. В восточном календаре принят 60­летний цикл, состоящий из 12­летних

подциклов, обозначаемых названиями цвета: зеленый, красный, желтый, белый

и черный. В каждом подцикле годы носят названия животных: крысы, коровы,

тигра, зайца, дракона, змеи, лошади, овцы, обезьяны, курицы, собаки и

свиньи. По номеру года определить его название, если 1984 год — начало

цикла: «год зеленой крысы».
 */
public class EastCalendar {
    public static void main (String[] args) {
        eastCalendar(1991);
    }

    private static void eastCalendar(int year){
        int cycleBegin = 1984;
        String color;
        String animalType;
        int cycleCounter = year - cycleBegin;
        int yearName = cycleCounter % 12 + 1;
        int colorNumber = cycleCounter % 10;


        switch (yearName) {
            case 1:
                animalType = "Год крысы";
                break;
            case 2:
                animalType = "Год Коровы";
                break;
            case 3:
                animalType = "Год Тигра";
                break;
            case 4:
                animalType = "Год Зайца";
                break;
            case 5:
                animalType = "Год Дракона";
                break;
            case 6:
                animalType = "Год Змеи";
                break;
            case 7:
                animalType = "Год Лошади";
                break;
            case 8:
                animalType = "Год Овцы";
                break;
            case 9:
                animalType = "Год Обезьяны";
                break;
            case 10:
                animalType = "Год Курицы";
                break;
            case 11:
                animalType = "Год Собаки";
                break;
            default:
                animalType = "Год Свиньи";

        }
        switch (colorNumber)  {
            case 1:
                color = "зеленый";
                break;
            case 2:
                color = "зеленый";
                break;
            case 3:
                color = "красный";
                break;
            case 4:
                color = "красный";
                break;
            case 5:
                color = "желтый";
                break;
            case 6:
                color = "желтый";
                break;
            case 7:
                color = "белый";
                break;
            case 8:
                color = "белый";
                break;
            case 9:
                color = "черный";
                break;
            default:
                color = "черный";

        }

        System.out.print("Год " + year);
        System.out.println();
        System.out.print("Животное " + animalType);
        System.out.println();
        System.out.print("Цвет " + color);
    }
}
