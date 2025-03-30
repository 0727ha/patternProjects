package patternProjects;


import java.awt.BorderLayout;
//import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class GMainFrame extends JFrame {
	private static final long serialVersionUID= 1L;
	
	//�޴��ٿ� ���� ������� ��ġ��
	
	private GMenuBar menuBar;
	private GToolBar toolBar;
	private GDrawingPanel drawingPanel;
	  private JTextField textField;
	
	public GMainFrame() {
		//attiribute : �Ӽ� ��ȭ
		this.setLocation(100,200);
		this.setSize(100,200);//���� �Ӽ� ��ȭ
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//close�ϸ� ���α׷� ����� �ǹ�
		
		//component
		this.setLayout(new BorderLayout());
		
		this.drawingPanel = new GDrawingPanel();

        // �ؽ�Ʈ �Է� �ʵ� ���� �� ����
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

	
	//�ι�°
	public void initialize() {
		this.menuBar.initialize();
		this.toolBar.initialize();
		this.drawingPanel.initialize();
		
	}

}
