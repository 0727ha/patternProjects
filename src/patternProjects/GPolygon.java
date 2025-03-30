package patternProjects;

import java.awt.Graphics;

public class GPolygon extends GShape {

    public GPolygon(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void draw(Graphics g) {
        int cx = x + width / 2;
        int cy = y + height / 2;
        int radius = Math.min(width, height) / 2;

        int[] xPoints = new int[5];
        int[] yPoints = new int[5];

        for (int i = 0; i < 5; i++) {
            double angle = Math.toRadians(90 + i * 72);
            xPoints[i] = cx + (int)(radius * Math.cos(angle));
            yPoints[i] = cy - (int)(radius * Math.sin(angle));
        }

        g.drawPolygon(xPoints, yPoints, 5);
    }
}

