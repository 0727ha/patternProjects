package patternProjects;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
public class GEditMenu extends JMenu {
	private static final long serialVersionUID = 1L;
	
	private JMenuItem propertyItem;
    private JMenuItem undoItem;
    private JMenuItem redoItem;
    
    public GEditMenu() {
        super("Edit");

        // 항목 생성
        this.propertyItem = new JMenuItem("Property");
        this.undoItem = new JMenuItem("Undo");
        this.redoItem = new JMenuItem("Redo");

        // 메뉴에 항목 추가
        this.add(propertyItem);
        this.addSeparator();
        this.add(undoItem);
        this.add(redoItem);
    }
    
    public void initialize() {
        
    }
    //getter부분
    public JMenuItem getPropertyItem() {
        return propertyItem;
    }

    public JMenuItem getUndoItem() {
        return undoItem;
    }

    public JMenuItem getRedoItem() {
        return redoItem;
    }
    

}
