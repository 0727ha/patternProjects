package patternProjects;


public class GMain {

	public static void main(String[] args) {
		GMainFrame mainFrame = new GMainFrame();
		mainFrame.setVisible(true);
		
		//만약 모든 구조가 완료된 상태라면 아래의 것을 작성해서 그 구조를 또 하나 실행하는 것이다.
		mainFrame.initialize();
	}

}
