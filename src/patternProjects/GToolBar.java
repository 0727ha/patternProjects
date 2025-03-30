package patternProjects;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;

public class GToolBar extends JToolBar {
	private static final long serialVersionUID = 1L;

	private JRadioButton rectangleButton;
	private JRadioButton triangleButton;
	private JRadioButton ovalButton;
	private JRadioButton polygonButton;
	private JRadioButton textBoxButton;

	private GDrawingPanel drawingPanel;

	public GToolBar(GDrawingPanel drawingPanel) {
		super(); // JToolBar 생성자 호출
		this.drawingPanel = drawingPanel;

		// 버튼 생성
		this.rectangleButton = new JRadioButton("Rectangle");
		this.triangleButton = new JRadioButton("Triangle");
		this.ovalButton = new JRadioButton("Oval");
		this.polygonButton = new JRadioButton("Polygon");
		this.textBoxButton = new JRadioButton("TextBox");

		// 버튼 그룹화 - 하나만 선택되게
		ButtonGroup group = new ButtonGroup();
		group.add(rectangleButton);
		group.add(triangleButton);
		group.add(ovalButton);
		group.add(polygonButton);
		group.add(textBoxButton);

		// 툴바에 버튼 추가
		this.add(rectangleButton);
		this.add(triangleButton);
		this.add(ovalButton);
		this.add(polygonButton);
		this.add(textBoxButton);

		// 버튼 클릭 시 도형 선택 전달
		rectangleButton.addActionListener(e -> drawingPanel.setSelectedShape(ShapeType.Rectangle));
		triangleButton.addActionListener(e -> drawingPanel.setSelectedShape(ShapeType.Triangle));
		ovalButton.addActionListener(e -> drawingPanel.setSelectedShape(ShapeType.Oval));
		polygonButton.addActionListener(e -> drawingPanel.setSelectedShape(ShapeType.Polygon));
		textBoxButton.addActionListener(e -> drawingPanel.setSelectedShape(ShapeType.TextBox));
	}

	public void initialize() {
		// 필요 시 초기화 코드
	}

}
