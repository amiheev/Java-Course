package Lesson10.HomeWork;

import java.util.Scanner;

/**
 * Created by Alexey on 01.10.2015.
 */
public class FileStat {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла ");
        String fileName = scanner.next();
        System.out.println("Выберите какую информацию о файле вы хотите получить");
        System.out.println("Для получения кол-ва строк в файле введите string" + "\n"
        + "Для получения кол-ва символов в файле введите char" + "\n"
        + "Для получения кол-ва слов в файле введите word" + "\n"
        + "Для получения кол-ва предложений в файле введите sentence" + "\n"
        + "Для получения всей информации о файле введите любой символ");
        String stat = scanner.next().toLowerCase();
        switch (stat){
            case "string" :
                FileScanner.stringFileScanner(fileName);
                break;
            case "char" :
                FileScanner.charsFileScanner(fileName);
                break;
            case "word" :
                FileScanner.wordsrFileScanner(fileName);
                break;
            case "sentence" :
                FileScanner.sentencesFileScanner(fileName);
                break;
            default:
                FileScanner.fullStatScanner(fileName);

        }

    }
}
