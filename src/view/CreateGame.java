package view;

import javax.swing.*;
import java.awt.*;

public class CreateGame {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                BoardFrame BoardWiev = new BoardFrame("XO GAME");
                BoardWiev.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                BoardWiev.setVisible(true);
            }
        });


    }
}
