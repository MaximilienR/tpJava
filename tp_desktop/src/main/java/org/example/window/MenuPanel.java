package org.example.window;

import lombok.Data;

import javax.swing.*;

@Data
public class MenuPanel {
    private JButton testButton;
    public  MenuPanel(){
        testButton.setText("test");
    }
}
