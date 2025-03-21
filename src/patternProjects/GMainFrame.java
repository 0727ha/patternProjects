package patternProjects;


import java.awt.FlowLayout;

import javax.swing.JFrame;

public class GMainFrame extends JFrame {
	private static final long serialVersionUID= 1L;
	
	//메뉴바와 툴바 드로윙이 위치함
	
	private GMenuBar menuBar;
	private GToolBar toolBar;
	private GDrawingPanel drawingPanel;
	
	public GMainFrame() {
		//attiribute : 속성 변화
		this.setLocation(100,200);
		this.setSize(100,200);//나의 속성 변화
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//close하면 프로그램 끄라는 의미
		
		//component
		this.setLayout(new FlowLayout());
		
		//1)
		this.menuBar= new GMenuBar();
		this.setJMenuBar(menuBar);
		//2)
		this.toolBar =new GToolBar();
		this.add(toolBar);
		//3)
		this.drawingPanel= new GDrawingPanel();
		this.add(drawingPanel);
		
		
	}
	
	//두번째
	public void initialize() {
		this.menuBar.initialize();
		this.toolBar.initialize();
		this.drawingPanel.initialize();
		
	}

}
