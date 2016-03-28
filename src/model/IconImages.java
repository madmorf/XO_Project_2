package model;

import javax.swing.*;
import java.net.URL;

public class IconImages {

    private URL ImagePath;

    public URL getEmpty(){
        try {
            ImagePath = getClass().getResource("Resources/Empty.png");
        } catch (Exception e) {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Изображение не найдено");
        }
        return ImagePath;
    }

    public URL getX(){
        try {
            ImagePath = getClass().getResource("Resources/X.png");
        } catch (Exception e) {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Изображение не найдено");
        }
        return ImagePath;
    }

    public URL getO(){
        try {
            ImagePath = getClass().getResource("Resources/O.png");
        } catch (Exception e) {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Изображение не найдено");
        }
        return ImagePath;
    }
}
