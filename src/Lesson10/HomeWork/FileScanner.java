package Lesson10.HomeWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Alexey on 01.10.2015.
 */
public class FileScanner {
    public static void stringFileScanner(String fileName){
        try ( FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader))
        {   int lineCounter = 0;
            String s = reader.readLine();
            while (s != null) {
                lineCounter++;
                s = reader.readLine();
            }
            System.out.println("Кол-во строк в файле "  + lineCounter);
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void charsFileScanner(String fileName){
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader reader = new BufferedReader(fileReader) )
        {
            int i = reader.read();
            int charsCounter = 0;
            while (i != -1){
                if (((char) i) != ' ' && i != '\n' && i != '\r' && i != 0){
                    charsCounter++;
                }
                i = reader.read();
            }
            System.out.println("Кол-во символов в файле " + charsCounter);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void wordsrFileScanner(String fileName){
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader reader = new BufferedReader(fileReader) )
        {
            int i = reader.read();
            int wordCounter = 1;
            if (reader.read() == -1){
                System.out.println("Кол-во слов в файле 0");
            } else {
                while (i != -1){
                    if ((char) i == ' ' || i == '\n'){
                        wordCounter++;
                    }
                    i = reader.read();
                }
                System.out.println("Кол-во слов в файле " + wordCounter);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void sentencesFileScanner(String fileName){
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader reader = new BufferedReader(fileReader) )
        {
            int i = reader.read();
            int sentenceCounter = 1;
            if (reader.read() == -1) {
                System.out.println("Кол-во предложений в файле 0");
            }else {
                while (i != -1) {
                    if ((char) i == '.') {
                        sentenceCounter++;
                    }
                    i = reader.read();
                }
                System.out.println("Кол-во предложений в файле " + sentenceCounter);
            }



        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void fullStatScanner(String fileName){
        System.out.println("Имя файла " + fileName);
        stringFileScanner(fileName);
        charsFileScanner(fileName);
        wordsrFileScanner(fileName);
        sentencesFileScanner(fileName);
    }
    // test
}
