package patternProjects;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class GGraphicMenu extends JMenu {
	private static final long serialVersionUID = 1L;


	private JMenuItem lineThicknessItem;
    private JMenuItem lineStyleItem;
    private JMenuItem fontStyleItem;
    private JMenuItem fontSizeItem;

    
    public GGraphicMenu() {
        super("Graphic");

        // 항목 생성
        this.lineThicknessItem = new JMenuItem("Line Thickness");
        this.lineStyleItem = new JMenuItem("Line Style");
        this.fontStyleItem = new JMenuItem("Font Style");
        this.fontSizeItem = new JMenuItem("Font Size");

        // 메뉴에 항목 추가
        this.add(lineThicknessItem);
        this.add(lineStyleItem);
        this.add(fontStyleItem);
        this.add(fontSizeItem);
    }
    
   public void initialize() {
	   
   }
   //getter 부분
   public JMenuItem getLineThicknessItem() {
       return lineThicknessItem;
   }

   public JMenuItem getLineStyleItem() {
       return lineStyleItem;
   }

   public JMenuItem getFontStyleItem() {
       return fontStyleItem;
   }

   public JMenuItem getFontSizeItem() {
       return fontSizeItem;
   }
}
