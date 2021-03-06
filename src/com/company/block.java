package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class block extends Rectangle {

    Image pic;
    boolean destroyed;


    block(int x, int y, int w, int h, String s){
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
        try {
            pic = ImageIO.read(new File("src/)"+s));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics g, Component c){
        if(!destroyed)
            g.drawImage(pic,x,y,width,height,c);
    }
}
