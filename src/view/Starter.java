package view;

import controller.GameKernell;

import javax.swing.*;
import java.awt.*;

public class Starter {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                GameKernell kernell = new GameKernell();
                kernell.CreateGame();
            }
        });
    }
}
