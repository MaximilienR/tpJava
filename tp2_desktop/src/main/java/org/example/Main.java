package org.example;

import org.example.panel.ContactPanel;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame  = new JFrame("liste des contacts");
        frame.setSize(new Dimension(500,300));
        frame.setContentPane(new  ContactPanel(frame).getMainPanel());
    }
}