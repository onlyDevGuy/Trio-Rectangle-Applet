package vut;

import java.applet.Applet;
import java.awt.*;
import javax.swing.JOptionPane;
import java.awt.event.*;

public class TrioRectApplet extends Applet {

    private TrioRectClass objTrio;
    private int xco, yco;

    public TrioRectApplet() {
        xco = Integer.parseInt(JOptionPane.showInputDialog("Enter x coord:"));
        yco = Integer.parseInt(JOptionPane.showInputDialog("Enter y coord:"));
        objTrio = new TrioRectClass(xco, yco);
        this.addMouseListener(new myTrioEvent());
    }

    @Override
    public void init() {
        setSize(700, 500);
        setFont(new Font("Arial", Font.BOLD, 20));
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        objTrio.displayTrioShape(g2);
    }

    private class myTrioEvent implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent me) {
            objTrio.setXco(me.getX());
            objTrio.setYco(me.getY());
            repaint();
        }
        @Override public void mousePressed(MouseEvent me)  { }
        @Override public void mouseReleased(MouseEvent me) { }
        @Override public void mouseEntered(MouseEvent me)  { }
        @Override public void mouseExited(MouseEvent me)   { }
    }
}