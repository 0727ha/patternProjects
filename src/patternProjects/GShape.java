package patternProjects;

import java.awt.Graphics;

public abstract class GShape {
    protected int x, y, width, height;

    public GShape(int x, int y, int width, int height) {
        this.x = x; this.y = y;
        this.width = width; this.height = height;
    }

    public abstract void draw(Graphics g);
}

