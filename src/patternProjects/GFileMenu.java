package patternProjects;


import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class GFileMenu extends JMenu {
	private static final long serialVersionUID = 1L;

	private JMenuItem newItem;
	private JMenuItem openItem;
    private JMenuItem saveItem;
    private JMenuItem saveAsItem;
    private JMenuItem quitItem;
	
	public GFileMenu() {
		//�޴��̸�
		super("File");
		
		// �׸� ����
        this.newItem = new JMenuItem("New");
        this.openItem = new JMenuItem("Open");
        this.saveItem = new JMenuItem("Save");
        this.saveAsItem = new JMenuItem("Save As");
        this.quitItem = new JMenuItem("Quit");
        
        // �޴��� �׸� �߰�
        this.add(newItem);
        this.add(openItem);
        this.add(saveItem);
        this.add(saveAsItem);
        this.addSeparator(); // ���м�
        this.add(quitItem);
		
	}
	
	//���Ŀ� �̰��� ���ο��� ó�� ������ ��� ���� ����
	 public void initialize() {
	        
	    }
	 //���Ŀ� �ܺο� �����ؾ��ϴ� ����� ���� �̸� ������ �ۼ��ص�
	 
	 public JMenuItem getNewItem() {
	        return newItem;
	    }

	    public JMenuItem getOpenItem() {
	        return openItem;
	    }

	    public JMenuItem getSaveItem() {
	        return saveItem;
	    }

	    public JMenuItem getSaveAsItem() {
	        return saveAsItem;
	    }

	    public JMenuItem getQuitItem() {
	        return quitItem;
	    }

}
