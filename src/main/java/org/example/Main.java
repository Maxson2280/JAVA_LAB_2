package org.example;

public class Main {

    public static void main(String[] args) {
        Action[] members = {
                new Human("Кирилл", 2.0D, 100),
                new Cat("Барсик", 3.0D, 150),
                new Robot("Бамблби", 1.0D, 200),
                new Robot("Optimus", 1.0D,200),
                new Robot("Megatron", 2.0,300)};
        Barrier[] obstacles = {
                Wall.MIDDLE,
                Wall.MIDDLE,
                RoadRun.MIDDLE,
                RoadRun.HIGH};
        for (Action a : members) {
            for (Barrier b : obstacles) {
                if (!b.getReady(b, a))
                    break;
            }
        }
    }
}
