package vut;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.*;

public class TrioRectClass {

    private int xco, yco;

    public TrioRectClass(int xco, int yco) {
        this.xco = xco;
        this.yco = yco;
    }

    public void setXco(int xco) { this.xco = xco; }
    public int getXco() { return xco; }

    public void setYco(int yco) { this.yco = yco; }
    public int getYco() { return yco; }

    public void displayTrioShape(Graphics2D g2) {
        int x1 = xco + 10;  int y1 = yco + 30;
        int x2 = x1  + 10;  int y2 = y1  + 30;

        Rectangle2D.Double box1 = new Rectangle2D.Double(xco, yco, 100, 100);
        g2.setColor(Color.orange);
        g2.fill(box1);

        Rectangle2D.Double box2 = new Rectangle2D.Double(x1, y1, 100, 100);
        g2.setColor(Color.red);
        g2.fill(box2);

        Rectangle2D.Double box3 = new Rectangle2D.Double(x2, y2, 100, 100);
        g2.setColor(Color.magenta);
        g2.fill(box3);
    }
}