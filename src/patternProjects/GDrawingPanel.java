package patternProjects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class GDrawingPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    private ShapeType selectedShapeType;
    private Point startPoint;
    private Point endPoint;
    private List<GShape> shapeList;
    private JTextField textField;

    public GDrawingPanel() {
        this.selectedShapeType = null;
        this.shapeList = new ArrayList<>();

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                startPoint = e.getPoint();

                // 텍스트박스 클릭 감지
                for (GShape shape : shapeList) {
                    if (shape instanceof GTextBox) {
                        GTextBox textBox = (GTextBox) shape;
                        if (textBox.containsPoint(e.getX(), e.getY())) {
                            showTextInput(textBox);
                            return;
                        }
                    }
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                endPoint = e.getPoint();
                createShapeFromDrag();
                repaint();
            }
        });

        this.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                endPoint = e.getPoint();
                repaint();
            }
        });
    }

    public void setSelectedShape(ShapeType shapeType) {
        this.selectedShapeType = shapeType;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    private void showTextInput(GTextBox textBox) {
        textField.setText(textBox.getText());
        textField.setBounds(textBox.x + 1, textBox.y + 1, textBox.width - 2, textBox.height - 2);
        textField.setVisible(true);
        textField.requestFocusInWindow();

        // 한 번만 이벤트 리스너 추가
        for (ActionListener al : textField.getActionListeners()) textField.removeActionListener(al);
        for (FocusListener fl : textField.getFocusListeners()) textField.removeFocusListener(fl);

        textField.addActionListener(e -> {
            textBox.setText(textField.getText());
            textField.setVisible(false);
            repaint();
        });

        textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                textBox.setText(textField.getText());
                textField.setVisible(false);
                repaint();
            }
        });
    }

    private void createShapeFromDrag() {
        if (selectedShapeType == null || startPoint == null || endPoint == null) return;

        int x = Math.min(startPoint.x, endPoint.x);
        int y = Math.min(startPoint.y, endPoint.y);
        int width = Math.abs(startPoint.x - endPoint.x);
        int height = Math.abs(startPoint.y - endPoint.y);

        GShape shape = null;

        switch (selectedShapeType) {
            case Rectangle:
                shape = new GRectangle(x, y, width, height);
                break;
            case Oval:
                shape = new GOval(x, y, width, height);
                break;
            case Triangle:
                shape = new GTriangle(x, y, width, height);
                break;
            case Polygon:
                shape = new GPolygon(x, y, width, height);
                break;
            case TextBox:
                shape = new GTextBox(x, y, width, height, "");
                break;
        }

        if (shape != null) {
            shapeList.add(shape);
        }

        startPoint = null;
        endPoint = null;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (GShape shape : shapeList) {
            shape.draw(g);
        }

        // 드래그 미리보기
        if (startPoint != null && endPoint != null && selectedShapeType != null) {
            int x = Math.min(startPoint.x, endPoint.x);
            int y = Math.min(startPoint.y, endPoint.y);
            int width = Math.abs(startPoint.x - endPoint.x);
            int height = Math.abs(startPoint.y - endPoint.y);

            switch (selectedShapeType) {
                case Rectangle:
                    g.drawRect(x, y, width, height);
                    break;
                case Oval:
                    g.drawOval(x, y, width, height);
                    break;
                case Triangle:
                    int x1 = x + width / 2;
                    int y1 = y;
                    int x2 = x;
                    int y2 = y + height;
                    int x3 = x + width;
                    int y3 = y + height;
                    g.drawPolygon(new int[]{x1, x2, x3}, new int[]{y1, y2, y3}, 3);
                    break;
                case Polygon:
                    int cx = x + width / 2;
                    int cy = y + height / 2;
                    int radius = Math.min(width, height) / 2;
                    int[] px = new int[5];
                    int[] py = new int[5];
                    for (int i = 0; i < 5; i++) {
                        double angle = Math.toRadians(90 + i * 72);
                        px[i] = cx + (int)(radius * Math.cos(angle));
                        py[i] = cy - (int)(radius * Math.sin(angle));
                    }
                    g.drawPolygon(px, py, 5);
                    break;
                case TextBox:
                    g.drawRect(x, y, width, height);
                    break;
            }
        }
    }

    public void initialize() {}
}
