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

    public void showGameField(){
        for (int i = 0; i < GameField.length; i++){
            for (int j = 0; j < GameField[0].length; j++){
                System.out.println(GameField[i][j]);
            }
        }
    }
}
