package org.example.crud;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Connector {
    private File file = new File("\\src\\main\\resources");


    public void writeToFile(Figter fighter) {
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(fighter.toString);

        } catch (IOException e) {
            System.out.println("Путь к файлу неверен");

        }

    }
    public void readFIle(){
        //Вывести всех файтеров в консоль
    }
    public void readFighter(int id){
        //Вернуть файтера по id
    }
    public void updateFighter(int id){
        // Изменение полей в объекте

    }
    public void deleteFighter(int id){
        // удаление объекта из файла по id
    }
}
