package patternProjects;

import java.awt.Graphics;

public class GTriangle extends GShape {

    public GTriangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void draw(Graphics g) {
        int x1 = x + width / 2;
        int y1 = y;
        int x2 = x;
        int y2 = y + height;
        int x3 = x + width;
        int y3 = y + height;

        int[] xPoints = { x1, x2, x3 };
        int[] yPoints = { y1, y2, y3 };

        g.drawPolygon(xPoints, yPoints, 3);
    }
}

