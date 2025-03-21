package patternProjects;


import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GToolBar extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JRadioButton rectangleButton;//작성 후 import해주기
	public GToolBar() {
		
		this.setLayout(new FlowLayout(FlowLayout.LEFT));//툴바를 왼쪽으로..근데 적용안도미. 다시 코드 수정하기 
		
		this.rectangleButton= new JRadioButton("rectangle");
		this.add(this.rectangleButton);//add를 사용하여 자식으로 등록
	}
	public void initialize() {
		// TODO Auto-generated method stub
		
	}

}
