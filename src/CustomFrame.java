import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CustomFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CustomFrame(String title,Color background) {
		init(title,background);
	}
	
	private void init(String title,Color background) {
		this.setSize(700,600);
		this.setTitle(title);
		this.setResizable(false);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		this.getContentPane().setBackground(background);
		this.setLayout(null);
	}

}
