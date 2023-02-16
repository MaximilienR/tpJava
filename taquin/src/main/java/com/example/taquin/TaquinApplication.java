package com.example.taquin;

import com.example.taquin.windiw.Taquin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.awt.*;


public class TaquinApplication {

    public static void main(String[] args) {
        JFrame taquinFrame = new JFrame("jeu du taquin");
        taquinFrame.setSize(new Dimension(400,800));
     //   taquinFrame.setContentPane(new Taquin().getTaquinPanel());
        taquinFrame.setVisible(true);
    }

}
