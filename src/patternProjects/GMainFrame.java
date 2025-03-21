package patternProjects;


import java.awt.FlowLayout;

import javax.swing.JFrame;

public class GMainFrame extends JFrame {
	private static final long serialVersionUID= 1L;
	
	//�޴��ٿ� ���� ������� ��ġ��
	
	private GMenuBar menuBar;
	private GToolBar toolBar;
	private GDrawingPanel drawingPanel;
	
	public GMainFrame() {
		//attiribute : �Ӽ� ��ȭ
		this.setLocation(100,200);
		this.setSize(100,200);//���� �Ӽ� ��ȭ
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//close�ϸ� ���α׷� ����� �ǹ�
		
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
	
	//�ι�°
	public void initialize() {
		this.menuBar.initialize();
		this.toolBar.initialize();
		this.drawingPanel.initialize();
		
	}

}
