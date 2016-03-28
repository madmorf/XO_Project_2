package controller;

import model.Figure;
import model.Player;

import javax.swing.*;
import java.util.Arrays;

public class WinnerHandler {

    private Figure[][] GameField;

    private Player CurrentPlayer;

    private boolean[] HorizontalNullCounter = new boolean[3];

    private boolean[] VerticalNullCounter = new boolean[3];

    private boolean DiagonalRightNull;

    private boolean DiagonalLeftNull;

    public WinnerHandler(Figure[][] gameField) {
        this.GameField = gameField;
    }

    public void checkWinner() {
        checkDiagonalRightNull();
        checkDiagonalLeftNull();
        checkVerticalForNull();
        checkHorizontalForNull();
        findWinner();
    }

    private void checkVerticalForNull() {
        for (int i = 0; i < GameField.length; i++) {
            if (GameField[i][0] == null) {
                VerticalNullCounter[0] = true;
                break;
            } else {
                VerticalNullCounter[0] = false;
            }
        }
        for (int i = 0; i < GameField.length; i++) {
            if (GameField[i][1] == null) {
                VerticalNullCounter[1] = true;
                break;
            } else {
                VerticalNullCounter[1] = false;
            }
        }
        for (int i = 0; i < GameField.length; i++) {
            if (GameField[i][2] == null) {
                VerticalNullCounter[2] = true;
                break;
            } else {
                VerticalNullCounter[2] = false;
            }
        }
    }

    private void checkHorizontalForNull() {
        for (int i = 0; i < GameField.length; i++) {
            if (GameField[0][i] == null) {
                HorizontalNullCounter[0] = true;
                break;
            } else {
                HorizontalNullCounter[0] = false;
            }
        }
        for (int i = 0; i < GameField.length; i++) {
            if (GameField[1][i] == null) {
                HorizontalNullCounter[1] = true;
                break;
            } else {
                HorizontalNullCounter[1] = false;
            }
        }
        for (int i = 0; i < GameField.length; i++) {
            if (GameField[2][i] == null) {
                HorizontalNullCounter[2] = true;
                break;
            } else {
                HorizontalNullCounter[2] = false;
            }
        }
    }

    private void checkDiagonalRightNull(){
        for (int i = 0, j = GameField.length -1; i < GameField.length; i++, j--) {
            if (GameField[i][j] == null) {
                DiagonalRightNull = true;
                break;
            } else {
                DiagonalRightNull = false;
            }
        }
    }

    private void checkDiagonalLeftNull(){
        for (int i = 0; i < GameField.length; i++) {
            if (GameField[i][i] == null) {
                DiagonalLeftNull = true;
                break;
            } else {
                DiagonalLeftNull = false;
            }
        }
    }

    private void findWinner() {
        if (DiagonalRightNull == false){
            if (GameField[0][2].equals(GameField[1][1]) && GameField[1][1].equals(GameField[2][0])){
                JFrame frame = new JFrame();
                JOptionPane.showMessageDialog(frame, "Победил " + GameField[0][2] + " " + CurrentPlayer.getName());
            }
        }


        if (DiagonalLeftNull == false){
            if (GameField[0][0].equals(GameField[1][1]) && GameField[1][1].equals(GameField[2][2])){
                JFrame frame = new JFrame();
                JOptionPane.showMessageDialog(frame, "Победил " + GameField[0][0] + " " + CurrentPlayer.getName());
            }
        }

        for (int i = 0; i < 3; i++)
            if (HorizontalNullCounter[i] == false) {
                if (GameField[i][0].equals(GameField[i][1]) && GameField[i][1].equals(GameField[i][2])) {
                    JFrame frame = new JFrame();
                    JOptionPane.showMessageDialog(frame, "Победил " + GameField[i][0] + " " + CurrentPlayer.getName());
                    break;
                }
            }

        for (int i = 0; i < 3; i++) {
            if (VerticalNullCounter[i] == false) {
                if (GameField[0][i].equals(GameField[1][i]) && GameField[1][i].equals(GameField[2][i])) {
                    JFrame frame = new JFrame();
                    JOptionPane.showMessageDialog(frame, "Победил " + GameField[0][i] + " " + CurrentPlayer.getName());
                    break;
                }
            }
        }
    }

    public void setCurrentPlayer(Player currentPlayer) {
        CurrentPlayer = currentPlayer;
    }
}
