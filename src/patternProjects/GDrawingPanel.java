package patternProjects;


import java.awt.Graphics;

import javax.swing.JPanel;

public class GDrawingPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	//아래 클래스로 코드 작서하기 시작!
	public GDrawingPanel() {
		//나중에 마우스 이벤트를 받아내는 부분을 만드는 것 . eventhandler도 사실 다 있음 그것을 사용하는 것
		
		
	}
	public void draw() {
		Graphics graphics =this.getGraphics();
		graphics.drawRect(10,10,50,50);
	}
	public void initialize() {
		this.draw();
		
	}

}
