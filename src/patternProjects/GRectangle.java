package patternProjects;

import java.awt.Graphics;

public class GRectangle extends GShape {

    public GRectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(x, y, width, height);
    }
}
