package Lesson5.HomeWorkSeptember11;

/*
        24. Дано целое число в диапазоне 100–999. Вывести строку­описание

        данного числа, например: 256 — «двести пятьдесят шесть», 814 — «восемьсот четырнадцать».
 */
public class NumberToString {


    public static void main (String[] args) {
        numToString(963);
    }

    private static void numToString (Integer dig){
        if (dig >= 100 && dig <=999) {


        String s1 = getHundreds(dig);
        String s2 ;
        String s3 ;
        if (dig.toString().charAt(1) == '1'){
            s2 = getTeens(dig);
            s3 = "";

        } else {
            s2 = getDecades(dig);
            s3 = getUnits(dig);
        }
        System.out.println(s1  + s2 + s3);
        }else System.out.println("The number should be in range between 100 - 999 . Input correct number");

    }

    private static String getHundreds(Integer dig) {
        String s = "";
        s = s.valueOf(dig);


        switch ( s.charAt(0)) {
            case '1':
                return "сто";
            case '2':
                return "двести";
            case '3':
                return "триста";
            case '4':
                return "четыреста";
            case '5':
                return "пятьсот";
            case '6':
                return "шестсот";
            case '7':
                return "семсот";
            case '8':
                return "восемсот";
            case '9':
                return "девятьсот";
            default:
                return " ";
        }
    }

    private static String getDecades(Integer dig) {
        String s = dig.toString();

        switch (s.charAt(1)) {
            case '1':
                return " десять";
            case '2':
                return " двадцать";
            case '3':
                return " тридцать";
            case '4':
                return " сорок";
            case '5':
                return " пятьдесят";
            case '6':
                return " шестьдесят";
            case '7':
                return " семьдесят";
            case '8':
                return " восемьдесят";
            case '9':
                return " девяносто";
            default:
                return " ";
        }
    }



    private static String getTeens(Integer dig) {
        String s = "";
        s = s.valueOf(dig);
        switch (s.charAt(2)) {
            case '1':
                s = " одиннадцать";
                break;
            case '2':
                s = " двенадцать";
                break;
            case '3':
                s = " тринадцать";
                break;
            case '4':
                s = " четырнадцать";
                break;
            case '5':
                s = " пятнадцать";
                break;
            case '6':
                s = " шестнадцать";
                break;
            case '7':
                s = " семнадцать";
                break;
            case '8':
                s = " восемнадцать";
                break;
            case '9':
                s = " девятнадцать";
                break;
        }
        return s;
    }

    private static String getUnits(int dig) {
        String s = "";
        s = s.valueOf(dig);
        switch (s.charAt(2)) {
            case '1':
                return " один";
            case '2':
                return " два";
            case '3':
                return " три";
            case '4':
                return " четыре";
            case '5':
                return " пять";
            case '6':
                return " шесть";
            case '7':
                return " семь";
            case '8':
                return " восемь";
            case '9':
                return " девять";
            default:
                return " ";
        }
    }

}
