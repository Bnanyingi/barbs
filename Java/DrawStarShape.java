import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Path2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class DrawStarShape{
    public static void main(String [] args){
       SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                createAndShowGUI();
            }
       });
    }
    private static void createAndShowGUI(){
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(new DrawStarShapePanel());
        f.setSize(600, 600);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}

class DrawStarShapePanel extends JPanel{
    @Override protected void paintComponent(Graphics gr){
        super.paintComponent(gr);
        Graphics2D
    }
}