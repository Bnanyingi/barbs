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

public class DrawStarShape
{
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
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
        Graphics2D g = (Graphics2D) gr;
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);

        g.setColor(Color.BLACK);
        g.draw(createDefaultStar(50, 200, 200));

        g.setPaint(Color.RED);
        g.fill(createStar(400, 400, 40, 60, 10, 0));

        g.setPaint(new RadialGradientPaint(
            new Point(400, 200), 60, new float[] { 0, 1 }, 
            new Color[] { Color.RED, Color.YELLOW }));
        g.fill(createStar(400, 200, 20, 60, 8, 0));

        g.setPaint(new RadialGradientPaint(
            new Point(200, 400), 50, new float[] { 0, 0.3f, 1 }, 
            new Color[] { Color.RED, Color.YELLOW, Color.ORANGE }));
        g.fill(createStar(200, 400, 40, 50, 20, 0));

    }

    private static Shape createDefaultStar(double radius, double centerX,
        double centerY)
    {
        return createStar(centerX, centerY, radius, radius * 2.63, 5,
            Math.toRadians(-18));
    }

    private static Shape createStar(double centerX, double centerY,
        double innerRadius, double outerRadius, int numRays,
        double startAngleRad){
        Path2D path = new Path2D.Double();
        double deltaAngleRad = Math.PI / numRays;
        for (int i = 0; i < numRays * 2; i++){
            double angleRad = startAngleRad + i * deltaAngleRad;
            double ca = Math.cos(angleRad);
            double sa = Math.sin(angleRad);
            double relX = ca;
            double relY = sa;
            if ((i & 1) == 0){
                relX *= outerRadius;
                relY *= outerRadius;
            }else {
                relX *= innerRadius;
                relY *= innerRadius;
            }if (i == 0) {
                path.moveTo(centerX + relX, centerY + relY);
            }else{
                path.lineTo(centerX + relX, centerY + relY);
            }
        }path.closePath();
        return path;
    }
}