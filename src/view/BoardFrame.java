package view;

import javax.swing.*;
import java.awt.*;

public class BoardFrame extends JFrame  {
    private Toolkit toolkit = Toolkit.getDefaultToolkit();

    public BoardFrame(String title){
        super();
        configure();

    }

    private void configure(){
        setResizable(false);
        setSize(400,400);
        putFrameInTheCenterOfTheScreen();
    }

    private void putFrameInTheCenterOfTheScreen() {
        Dimension screenSize = toolkit.getScreenSize();

        setLocation((screenSize.width - getWidth()) / 2, (screenSize.height - getHeight()) / 2);
    }


}
