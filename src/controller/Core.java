package controller;

import model.Board;
import model.Figure;
import model.Player;

import java.awt.*;

public class Core {

    private Figure[][] field;

    public void setFogureToTheField(Board board, Point coordinate, Player player){
        field = board.getGameField();
        field[(int) coordinate.getX()][(int) coordinate.getY()] = player.getFigure();

    }

}
