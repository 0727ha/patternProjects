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

        // �׸� ����
        this.propertyItem = new JMenuItem("Property");
        this.undoItem = new JMenuItem("Undo");
        this.redoItem = new JMenuItem("Redo");

        // �޴��� �׸� �߰�
        this.add(propertyItem);
        this.addSeparator();
        this.add(undoItem);
        this.add(redoItem);
    }
    
    public void initialize() {
        
    }
    //getter�κ�
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
