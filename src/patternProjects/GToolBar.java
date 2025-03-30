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
		super(); // JToolBar ������ ȣ��
		this.drawingPanel = drawingPanel;

		// ��ư ����
		this.rectangleButton = new JRadioButton("Rectangle");
		this.triangleButton = new JRadioButton("Triangle");
		this.ovalButton = new JRadioButton("Oval");
		this.polygonButton = new JRadioButton("Polygon");
		this.textBoxButton = new JRadioButton("TextBox");

		// ��ư �׷�ȭ - �ϳ��� ���õǰ�
		ButtonGroup group = new ButtonGroup();
		group.add(rectangleButton);
		group.add(triangleButton);
		group.add(ovalButton);
		group.add(polygonButton);
		group.add(textBoxButton);

		// ���ٿ� ��ư �߰�
		this.add(rectangleButton);
		this.add(triangleButton);
		this.add(ovalButton);
		this.add(polygonButton);
		this.add(textBoxButton);

		// ��ư Ŭ�� �� ���� ���� ����
		rectangleButton.addActionListener(e -> drawingPanel.setSelectedShape(ShapeType.Rectangle));
		triangleButton.addActionListener(e -> drawingPanel.setSelectedShape(ShapeType.Triangle));
		ovalButton.addActionListener(e -> drawingPanel.setSelectedShape(ShapeType.Oval));
		polygonButton.addActionListener(e -> drawingPanel.setSelectedShape(ShapeType.Polygon));
		textBoxButton.addActionListener(e -> drawingPanel.setSelectedShape(ShapeType.TextBox));
	}

	public void initialize() {
		// �ʿ� �� �ʱ�ȭ �ڵ�
	}

}
