package patternProjects;


import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GToolBar extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JRadioButton rectangleButton;//�ۼ� �� import���ֱ�
	public GToolBar() {
		
		this.setLayout(new FlowLayout(FlowLayout.LEFT));//���ٸ� ��������..�ٵ� ����ȵ���. �ٽ� �ڵ� �����ϱ� 
		
		this.rectangleButton= new JRadioButton("rectangle");
		this.add(this.rectangleButton);//add�� ����Ͽ� �ڽ����� ���
	}
	public void initialize() {
		// TODO Auto-generated method stub
		
	}

}
