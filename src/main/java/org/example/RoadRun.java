package org.example;

public enum RoadRun implements Barrier {
    LOW("Короткая", 50),
    MIDDLE("Средняя", 100),
    HIGH("Длинная", 150);

    private String Desc;

    private int Length;

    RoadRun(String desc, int length) {
        this.Desc = desc;
        this.Length = length;
    }

    public int getDistance() {
        return this.Length;
    }

    public boolean getReady(Barrier barrier, Action a) {
        if (a.Run(barrier.getDistance()))
            return true;
        return false;
    }
}