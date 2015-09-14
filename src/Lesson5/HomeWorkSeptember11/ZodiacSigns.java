package Lesson5.HomeWorkSeptember11;

/*
26.  Даны два целых числа: D (день) и M (месяц), определяющие правильную

 дату. Вывести знак Зодиака, соответствующий этой дате: «Водолей»

 (20.1–18.2), «Рыбы» (19.2–20.3), «Овен» (21.3–19.4), «Телец» (20.4–20.5),

 «Близнецы» (21.5–21.6), «Рак» (22.6–22.7), «Лев» (23.7–22.8), «Дева»

 (23.8–22.9), «Весы» (23.9–22.10), «Скорпион» (23.10–22.11), «Стрелец»

 (23.11–21.12), «Козерог» (22.12–19.1).
 */
public class ZodiacSigns {
    public static void main(String[] args){
        selectDate(11, 12);

    }

    private static void selectDate(int month, int day) {
        String zodiacSign;
        if (day >= 1 && day <= 31){

        switch (month) {
            case 1:
                if (day < 20) {
                    zodiacSign = "Capricorn";
                } else zodiacSign = "Aquarius";
                break;
            case 2:
                if (day < 19) {
                    zodiacSign = "Aquarius";
                }else zodiacSign = "Pisces";
                break;
            case 3:
                if (day < 21) {
                    zodiacSign = "Pisces";
                }else zodiacSign = "Aries";
                break;
            case 4:
                if (day < 20) {
                    zodiacSign = "Aries";
                }else zodiacSign = "Taurus";
                break;
            case 5:
                if (day < 21) {
                    zodiacSign = "Taurus";
                }else zodiacSign = "Gemini";
                break;
            case 6:
                if (day < 22) {
                    zodiacSign = "Gemini";
                }else zodiacSign = "Cancer";
                break;
            case 7:
                if (day < 23) {
                    zodiacSign = "Cancer";
                }else zodiacSign = "Leo";
                break;
            case 8:
                if (day < 23) {
                    zodiacSign = "Leo";
                }else zodiacSign = "Virgo";
                break;
            case 9:
                if (day < 23) {
                    zodiacSign = "Virgo";
                }else zodiacSign = "Libra";
                break;
            case 10:
                if (day < 23) {
                    zodiacSign = "Libra";
                }else zodiacSign = "Scorpio";
                break;
            case 11:
                if (day < 23) {
                    zodiacSign = "Scorpio";
                }else zodiacSign = "Sagittarius";
                break;
            case 12:
                if (day < 22) {
                    zodiacSign = "Sagittarius";
                }else zodiacSign = "Capricorn";
                break;
            default:
                zodiacSign = "Selected month doesn't exist";


        }
        System.out.println("The sign is " + zodiacSign);
    }else System.out.println("Selected day should be in range between 1 - 31");
    }


}
