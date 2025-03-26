package patternProjects;


import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class GDrawingPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private ShapeType selectedShapeType;
	
	//아래 클래스로 코드 작서하기 시작!
	public GDrawingPanel() {
		//나중에 마우스 이벤트를 받아내는 부분을 만드는 것 . eventhandler도 사실 다 있음 그것을 사용하는 것
		this.selectedShapeType = null;
		
		this.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mousePressed(MouseEvent e) {
		        draw(e.getX(), e.getY());
		    }
		});		
		
	}
	// 외부에서 선택한 도형을 전달받음
	 public void setSelectedShape(ShapeType shapeType) {
	        this.selectedShapeType = shapeType;
	    }
	 
	public void draw(int x, int y) {
		if (selectedShapeType == null) return;// 도형이 선택되지 않았으면 무시 즉 null에대한 예외 처리이다.
		
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
