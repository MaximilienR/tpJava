package org.example.window;

import lombok.Data;

import javax.swing.*;
import java.awt.*;
@Data
public class ProdWindo {
    private JPanel mainPanel;
    private GridLayout mainGridLayout;

    private GridBagConstraints bagConstraints;
    private String[] buttons = new String[]{"add","update","previus",};

    public  ProdWindo(){
        GridBagLayout bagLayout = new GridBagLayout();

        bagConstraints = new GridBagConstraints();
        bagConstraints.fill = GridBagConstraints.BOTH;
    }

}
