package lesson14;

import java.io.*;

public class Reader {
    public static void main (String[] args) throws IOException {
        String file = "C:\\Users\\user\\IdeaProjects\\Homework\\src\\lesson14\\Romeo and Juliet.txt";
        String outputFile = "C:\\Users\\user\\IdeaProjects\\Homework\\src\\lesson14\\Output.txt";

        try {
            FileReader fileReader = new FileReader(file);
        StringBuilder stringBuilder = new StringBuilder();

        while (fileReader.ready()){
            stringBuilder.append((char) fileReader.read());
        }
            fileReader.close();

        String longWord = "";
        String [] words = stringBuilder.toString().trim().split("[\\s\\p{Punct}]+");
        for (String word : words) {
            if(word.length() > longWord.length()) {
                longWord = word;
            }
        }
        System.out.println("Самое длинное слово: " + longWord);

        FileWriter fileWriter = new FileWriter(outputFile);
        fileWriter.write("Самое длинное слово из текста: " + longWord);
            System.out.println("Данные записаны в документ Output.txt");
        fileWriter.close();

        } catch (IOException e) {
        System.out.println("Файл не найден");
        }
    }
}
