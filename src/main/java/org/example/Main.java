package org.example;

import org.example.crud.Function;
import org.example.model.Fighter;

public class Main {
    public static void main(String[] args) {
        Fighter fighters1 = new Fighter(1,"Anderson silva", "Spider", 46, 84, 188, 94, 94, 98, 90, 93);
        Fighter fighters2 = new Fighter(2,"Nick Diaz", "209", 39, 77, 185, 88, 92, 90, 85, 85);
        Fighter fighters3 = new Fighter(3,"Robert Whittaker", "The Reaper", 32, 84, 180, 91, 91, 91, 91, 91);
        Fighter fighters4 = new Fighter(4,"Israel Adesanya", "The Last Stylebender", 33, 84, 193, 94, 94, 98, 88, 95);
        Fighter fighters5 = new Fighter(5,"Alexsandro Pereira", "Poatan", 35, 84, 193, 89, 96, 88, 84, 88);
        Fighter fighters6 = new Fighter(6,"Azizkhan","Abdulaev",23,77,190,90,90,90,90,90);
        Function con = new Function();
        con.addFighterToFile(fighters1);
        con.addFighterToFile(fighters2);
        con.addFighterToFile(fighters3);
        con.addFighterToFile(fighters4);
        con.addFighterToFile(fighters5);
        con.addFighterToFile(fighters6);


    }
}