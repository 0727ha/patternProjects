package patternProjects;


import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GToolBar extends JPanel {

	private static final long serialVersionUID = 1L;
	
	//���� ��ư�� �����ϱ�
	private JRadioButton rectangleButton;//�ۼ� �� import���ֱ�
	private JRadioButton triangleButton;
	private JRadioButton ovalButton;
	private JRadioButton polygonButton;
	private JRadioButton textBoxButton;
	
	//�׸��ǰ��� ������ ���ؼ� �׸����� ����ص� ����
	private GDrawingPanel drawingPanel;
	
	
	public GToolBar(GDrawingPanel drawingPanel) {
		this.drawingPanel = drawingPanel; // ���޹��� �׸����� �� ������ ����
		
		this.setLayout(new FlowLayout(FlowLayout.LEFT));//���ٸ� ��������..�ٵ� ����ȵ���. �ٽ� �ڵ� �����ϱ� 
		
		//��ư ��ü ����
		this.rectangleButton = new JRadioButton("Rectangle");
		this.triangleButton = new JRadioButton("Triangle");
		this.ovalButton = new JRadioButton("Oval");
		this.polygonButton = new JRadioButton("Polygon");
		this.textBoxButton = new JRadioButton("TextBox");
		
		// ��ư �׷�ȭ - �� ���� �ϳ��� ���� �����ϰ�
				ButtonGroup buttonGroup = new ButtonGroup();
				buttonGroup.add(rectangleButton);
				buttonGroup.add(triangleButton);
				buttonGroup.add(ovalButton);
				buttonGroup.add(polygonButton);
				buttonGroup.add(textBoxButton);

				
				// ��ư �߰�
				this.add(rectangleButton);
				this.add(triangleButton);
				this.add(ovalButton);
				this.add(polygonButton);
				this.add(textBoxButton);
				
				//��ư�� Ŭ�� �̺�Ʈ ��� (���� ���� �� �׸��ǿ� �˷���)
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
