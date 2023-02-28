package org.example.panel;

import lombok.Data;

import javax.swing.*;

@Data
public class ContactPanel {
    private JPanel mainPanel;
    private JPanel Random;
    private JButton ajouterButton;
    private JButton rechercherButton;
    private JTextField textField1;
    private JLabel tt;
    private JButton modifierButton;
    private JButton test;
    private JTextField textField2;
    private JTextField nTextField;
    private JTextField cityTextField;
    private JFrame _frame;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
//    public  ContactPanel(JFrame  frame){
//        _frame=frame;
//
//
//    }
}
