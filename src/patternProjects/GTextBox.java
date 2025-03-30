package patternProjects;

import java.awt.Graphics;

public class GTextBox extends GShape {
    private String text;

    public GTextBox(int x, int y, int width, int height, String text) {
        super(x, y, width, height);
        this.text = text;
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(x, y, width, height);
        g.drawString(text, x + 10, y + height / 2);
    }

    public boolean containsPoint(int px, int py) {
        return px >= x && px <= x + width && py >= y && py <= y + height;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
