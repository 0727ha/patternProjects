package patternProjects;


import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GToolBar extends JPanel {

	private static final long serialVersionUID = 1L;
	
	//도형 버튼들 선언하기
	private JRadioButton rectangleButton;//작성 후 import해주기
	private JRadioButton triangleButton;
	private JRadioButton ovalButton;
	private JRadioButton polygonButton;
	private JRadioButton textBoxButton;
	
	//그림판과의 연결을 위해서 그림판을 기억해둘 변수
	private GDrawingPanel drawingPanel;
	
	
	public GToolBar(GDrawingPanel drawingPanel) {
		this.drawingPanel = drawingPanel; // 전달받은 그림판을 내 변수에 저장
		
		this.setLayout(new FlowLayout(FlowLayout.LEFT));//툴바를 왼쪽으로..근데 적용안도미. 다시 코드 수정하기 
		
		//버튼 객체 생성
		this.rectangleButton = new JRadioButton("Rectangle");
		this.triangleButton = new JRadioButton("Triangle");
		this.ovalButton = new JRadioButton("Oval");
		this.polygonButton = new JRadioButton("Polygon");
		this.textBoxButton = new JRadioButton("TextBox");
		
		// 버튼 그룹화 - 한 번에 하나만 선택 가능하게
				ButtonGroup buttonGroup = new ButtonGroup();
				buttonGroup.add(rectangleButton);
				buttonGroup.add(triangleButton);
				buttonGroup.add(ovalButton);
				buttonGroup.add(polygonButton);
				buttonGroup.add(textBoxButton);

				
				// 버튼 추가
				this.add(rectangleButton);
				this.add(triangleButton);
				this.add(ovalButton);
				this.add(polygonButton);
				this.add(textBoxButton);
				
				//버튼에 클릭 이벤트 등록 (도형 선택 시 그림판에 알려줌)
		        rectangleButton.addActionListener(e -> drawingPanel.setSelectedShape(ShapeType.Rectangle));
		        triangleButton.addActionListener(e -> drawingPanel.setSelectedShape(ShapeType.Triangle));
		        ovalButton.addActionListener(e -> drawingPanel.setSelectedShape(ShapeType.Oval));
		        polygonButton.addActionListener(e -> drawingPanel.setSelectedShape(ShapeType.Polygon));
		        textBoxButton.addActionListener(e -> drawingPanel.setSelectedShape(ShapeType.TextBox));
	}
	public void initialize() {
		// TODO Auto-generated method stub
		
	}

}
