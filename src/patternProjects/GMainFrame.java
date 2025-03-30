package patternProjects;


import java.awt.BorderLayout;
//import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class GMainFrame extends JFrame {
	private static final long serialVersionUID= 1L;
	
	//메뉴바와 툴바 드로윙이 위치함
	
	private GMenuBar menuBar;
	private GToolBar toolBar;
	private GDrawingPanel drawingPanel;
	  private JTextField textField;
	
	public GMainFrame() {
		//attiribute : 속성 변화
		this.setLocation(100,200);
		this.setSize(100,200);//나의 속성 변화
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//close하면 프로그램 끄라는 의미
		
		//component
		this.setLayout(new BorderLayout());
		
		this.drawingPanel = new GDrawingPanel();

        // 텍스트 입력 필드 생성 및 주입
        this.textField = new JTextField();
        this.textField.setVisible(false);
        this.textField.setBorder(null);
        this.drawingPanel.setTextField(this.textField);
        this.drawingPanel.setLayout(null);
        this.drawingPanel.add(this.textField);

        this.add(drawingPanel, BorderLayout.CENTER);

        this.toolBar = new GToolBar(this.drawingPanel);
        this.add(toolBar, BorderLayout.NORTH);

        this.menuBar = new GMenuBar();
        this.setJMenuBar(menuBar);
    }

	
	//두번째
	public void initialize() {
		this.menuBar.initialize();
		this.toolBar.initialize();
		this.drawingPanel.initialize();
		
	}

}
