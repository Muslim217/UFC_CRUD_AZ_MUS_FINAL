package org.example.crud;

import com.google.gson.Gson;
import org.example.model.Fighter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Function {
    private File file = new File("src\\main\\resources\\DataBase.txt");
     Gson gson = new Gson ();


    private List<Fighter> readFromFile() {
        List<Fighter> resultList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            while ((bufferedReader.ready())) {
                resultList.add(gson.fromJson(bufferedReader.readLine(), Fighter.class));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultList;

    }

    private void writeInFileFromList(List<Fighter> fighterList) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true)) ) {
            for (Fighter fighterFromList : fighterList) {
                bufferedWriter.append(gson.toJson(fighterFromList));
                bufferedWriter.newLine();
                bufferedWriter.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


   public void addFighterToFile(Fighter f) {
        List<Fighter> fighterList = new ArrayList<>();
        fighterList.add(f);
        writeInFileFromList(fighterList);
    }

    public void readAll(){
        for (Fighter fighters:readFromFile()) {
            System.out.println(fighters);
        }
    }

    public void readById(int id){
        for (Fighter f :readFromFile()) {
            if(f.getId()==id){
                System.out.println(f);
            }
        }


    }
    public void deleteByteId(int id){

    }



}

