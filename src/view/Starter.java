package view;

import javax.swing.*;
import java.awt.*;

public class Starter {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                GameMainFrame BoardWiev = new GameMainFrame("XO GAME");
                BoardWiev.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                BoardWiev.setVisible(true);
            }
        });


    }
}
