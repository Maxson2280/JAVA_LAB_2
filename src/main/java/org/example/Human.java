package org.example;

public class Human implements Action {
    private double MaxHeight;

    private int MaxLength;

    private String Name;

    public boolean Run(int distance) {
        if (distance <= this.MaxLength) {
            System.out.println("Человек " + this.Name + " пробежал " + distance + "м");
            return true;
        }
        System.out.println("Человек " + this.Name + " не смог пробежать " + distance + "м");
        return false;
    }

    public boolean Jump(double distance) {
        if (distance <= this.MaxHeight) {
            System.out.println("Человек " + this.Name + " прыгнул на " + distance + "м");
            return true;
        }
        System.out.println("Человек " + this.Name + " не смог прыгнуть на " + distance + "м");
        return false;
    }

    Human(String name, double maxHeight, int maxLength) {
        this.MaxHeight = maxHeight;
        this.MaxLength = maxLength;
        this.Name = name;
    }
}
