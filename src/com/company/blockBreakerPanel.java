package com.company;

import jdk.nashorn.internal.ir.Block;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class blockBreakerPanel extends JPanel implements KeyListener {

    ArrayList<block> blocks = new ArrayList<block>();
    block ball = new block(237,435,25,25,"block1.png");
    block paddle = new block(175,480,150,25,"block1.png");

    Animate animate;

    blockBreakerPanel(){

        addKeyListener(this);
        setFocusable(true);
    }

    public void paintComponent(Graphics g){
        paddle.draw(g,this);
    }

    @Override
    public void keyTyped(KeyEvent e){

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            animate = new Animate(this);
            new Thread(() -> {
                while(true){
                    update();
                    try{
                        Thread.sleep(10);
                    }catch (InterruptedException err){
                        err.printStackTrace();
                    }
                }
            });
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void update() {
    }
}
