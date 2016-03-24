package model;

public class Player {

    private String Name;
    private Figure figure;

    public Player(String name, Figure figure) {
        Name = name;
        this.figure = figure;
    }

    public String getName() {
        return Name;
    }

    public Figure getFigure() {
        return figure;
    }
}
