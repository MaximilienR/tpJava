package org.example.window;

import lombok.Data;

import javax.swing.*;

@Data
public class MenuPanel {
    private JButton testButton;
    private JPanel menu;

    public  MenuPanel(JFrame productFrame){
        testButton.setText("test");
        menu.add(testButton);
    }
}
