package pr8.task1;

import java.awt.*;
import java.util.Random;

public class Rect extends Shape {
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        Graphics2D g2d=(Graphics2D)g;
        Random rand = new Random();
        x=rand.nextInt()%(201)+150;
        y=rand.nextInt()%(201)+150;
        color=new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
        g2d.setPaint(color);
        g2d.fillRect(x,y,100,100);
    }
}
