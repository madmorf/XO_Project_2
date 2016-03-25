package model;

public class Board {

    final static int FIELD_WIDTH = 3;

    final static int FIELD_HEIGHT = 3;

    private Figure[][] GameField = new Figure[FIELD_HEIGHT][FIELD_WIDTH];

    public Figure[][] getGameField() {
        return GameField;
    }

    public static int getFieldHeight() {
        return FIELD_HEIGHT;
    }

    public static int getFieldWidth() {
        return FIELD_WIDTH;
    }


}
