package org.example.panel;

import lombok.Data;

import javax.swing.*;

@Data
public class ContactPanel {
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton rechercherButton;
    private JPanel random;
    private JButton modifierButton;
    private JButton supprimerButton;
    private JButton detailButton;
    private JFrame _frame;
//    public  ContactPanel(JFrame  frame){
//        _frame=frame;
//
//
//    }
}
