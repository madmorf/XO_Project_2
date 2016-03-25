package controller;


import model.Figure;

import javax.swing.*;
import java.util.Arrays;

public class CheckWinnerHandler {
    private Figure[][] GameField;
    private boolean[] HorizontalNullCounter = new boolean[3];
    private boolean[] VerticalNullCounter = new boolean[3];
    private boolean DiagonalRightNull;
    private boolean DiagonalLeftNull;

    public CheckWinnerHandler(Figure[][] gameField) {
        this.GameField = gameField;
    }

    public void checkWinner() {
        for (int i = 0; i < GameField.length; i++) {
            System.out.println("");
            System.out.println();
            for (int j = 0; j < GameField[0].length; j++) {
                System.out.print(GameField[i][j] + "|");
            }
        }
        checkVerticalForNull();
        checkHorizontalForNull();
        System.out.println();
        System.out.println("horizontal " + Arrays.toString(HorizontalNullCounter));
        System.out.println("vertical" + Arrays.toString(VerticalNullCounter));
        find();
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

    private void find() {
        for (int i = 0; i < 3; i++)
            if (HorizontalNullCounter[i] == false) {
                if (GameField[i][0].equals(GameField[i][1])) {
                    System.out.println("Winner = " + GameField[i][0]);
                    JFrame frame = new JFrame();
                    JOptionPane.showMessageDialog(frame, "Победил " + GameField[i][0]);
                    break;
                }
            } else if (VerticalNullCounter[i] == false) {
                if (GameField[0][i].equals(GameField[1][i]) && GameField[0][i].equals(GameField[2][i])) {
                    System.out.println("Winner = " + GameField[0][i]);
                    JFrame frame = new JFrame();
                    JOptionPane.showMessageDialog(frame, "Победил " + GameField[0][i]);
                    break;
                }
            }
    }
}
