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
		//메뉴이름
		super("File");
		
		// 항목 생성
        this.newItem = new JMenuItem("New");
        this.openItem = new JMenuItem("Open");
        this.saveItem = new JMenuItem("Save");
        this.saveAsItem = new JMenuItem("Save As");
        this.quitItem = new JMenuItem("Quit");
        
        // 메뉴에 항목 추가
        this.add(newItem);
        this.add(openItem);
        this.add(saveItem);
        this.add(saveAsItem);
        this.addSeparator(); // 구분선
        this.add(quitItem);
		
	}
	
	//추후에 이곳에 내부에서 처리 가능한 기능 연결 예정
	 public void initialize() {
	        
	    }
	 //추후에 외부와 연결해야하는 기능을 위해 미리 구조를 작성해둠
	 
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
