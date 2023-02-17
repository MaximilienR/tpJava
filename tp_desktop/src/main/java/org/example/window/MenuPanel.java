package org.example.window;

import lombok.Data;

import javax.swing.*;
import java.awt.*;

@Data
public class MenuPanel {
    private JPanel mainPanel;
    private GridLayout mainGridLayout;

    private JButton testButton;
    private JPanel menu;

    public  MenuPanel(JFrame productFrame){
        testButton.setText("test");
        menu.add(testButton);
    }
}
