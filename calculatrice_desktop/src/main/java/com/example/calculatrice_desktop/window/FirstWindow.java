package com.example.calculatrice_desktop.window;

import lombok.Data;

import javax.swing.*;
import java.awt.*;

@Data
public class FirstWindow {
    private JPanel calcuatricPanel;

    public FirstWindow(){
        GridBagLayout g = new GridBagLayout();
        g.columnWidths=new  int[4];
        g.rowHeights=new  int[4];


    }
}
