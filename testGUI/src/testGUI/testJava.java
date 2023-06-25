package testGUI;
import java.awt.*;

public class testJava {
	private Frame f;
	private Panel pan;
	public testJava(String title) {
		f=new Frame(title);
		pan=new Panel();
	}
	public void launchFrame(){
		f.setSize(200,200);
		f.setBackground(Color.blue);
		f.setLayout(null);
		pan.setSize(100,100);
		pan.setBackground(Color.green);
		f.add(pan);
		f.setVisible(true);

	}
	public static void main(String[] args) {
		testJava TJ = new testJava("Hello World");
		TJ.launchFrame();
	}
}
