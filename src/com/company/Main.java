package com.company;
import javafx.application.Application;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Game Test");

        blockBreakerPanel panel = new blockBreakerPanel();

        frame.getContentPane().add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
        frame.setSize(490, 600);
        frame.setResizable(false);
    }
}
