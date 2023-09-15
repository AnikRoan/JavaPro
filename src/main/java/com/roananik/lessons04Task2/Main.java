package com.roananik.lessons04Task2;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {new Human(2, 100, "Igor")
                , new Cat(10, 50, "Murik")
                , new Robot(50, 10, "Robi")};

        Obstacle[] obstacles = {new Wall(2)
                , new TreadMill(20)
                , new Wall(8)
                , new TreadMill(80)};


        for (Obstacle obstacle : obstacles) {
            for (Participant participant : participants) {
                if (!obstacle.overcome(participant)) {
                    break;


                }
            }
        }
    }
}
