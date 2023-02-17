package org.example;

import org.example.window.MenuPanel;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main (String[] args) {

        JFrame productFrame = new JFrame("Interface gui");
        productFrame.setSize(new Dimension(500,5000));
        new MenuPanel(productFrame);
        productFrame.setContentPane(new MenuPanel(productFrame).getMenu());
        productFrame.setVisible(true);

    }


}
