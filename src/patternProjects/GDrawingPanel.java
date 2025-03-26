package patternProjects;


import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class GDrawingPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private ShapeType selectedShapeType;
	
	//�Ʒ� Ŭ������ �ڵ� �ۼ��ϱ� ����!
	public GDrawingPanel() {
		//���߿� ���콺 �̺�Ʈ�� �޾Ƴ��� �κ��� ����� �� . eventhandler�� ��� �� ���� �װ��� ����ϴ� ��
		this.selectedShapeType = null;
		
		this.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mousePressed(MouseEvent e) {
		        draw(e.getX(), e.getY());
		    }
		});		
		
	}
	// �ܺο��� ������ ������ ���޹���
	 public void setSelectedShape(ShapeType shapeType) {
	        this.selectedShapeType = shapeType;
	    }
	 
	public void draw(int x, int y) {
		if (selectedShapeType == null) return;// ������ ���õ��� �ʾ����� ���� �� null������ ���� ó���̴�.
		
		Graphics graphics =this.getGraphics();
		
		switch (selectedShapeType) {
		case Rectangle:
			graphics.drawRect(x, y, 100, 60);
			break;
		case Oval:
			graphics.drawOval(x, y, 100, 60);
			break;
		case Triangle:
			int[] xPoints = {x, x + 50, x - 50};
			int[] yPoints = {y, y + 100, y + 100};
			graphics.drawPolygon(xPoints, yPoints, 3);
			break;
		case Polygon:
			int[] px = {x, x + 30, x + 50, x + 20, x - 20};
			int[] py = {y, y - 40, y, y + 50, y + 50};
			graphics.drawPolygon(px, py, 5);
			break;
		case TextBox:
			graphics.drawRect(x, y, 120, 40);
			graphics.drawString("Text", x + 10, y + 25);
			break;
		default:
			break;
	}
	}
	
	public void initialize() {
	    if (this.selectedShapeType != null) {
	        this.draw(10, 10);
	    }
	}
}
