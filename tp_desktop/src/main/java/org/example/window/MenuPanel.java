package org.example.window;

import lombok.Data;

import javax.swing.*;

@Data
public class MenuPanel {
    private JButton testButton;
    private JPanel menu;

    public  MenuPanel(){
        testButton.setText("test");
        menu.add(testButton);
    }
}
