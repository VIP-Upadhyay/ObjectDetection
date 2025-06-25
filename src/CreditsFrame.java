import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CreditsFrame extends JFrame {


	private static final long serialVersionUID = 1L;
	
	public CreditsFrame(String frameName,Color background,Color textForeground) {
		init(frameName,background,textForeground);
	}

	public void init(String frameName,Color background,Color textForeground) {
		this.setSize(400,300);
		this.setTitle(frameName);
		this.setResizable(false);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		this.getContentPane().setBackground(background);
		this.setLayout(null);
		setTitle(textForeground);
		setPresenteBy(textForeground);
		setDeveloperName(textForeground);
		setGuidedBy(textForeground);
		setGuid(textForeground);
		setGuidInfo(textForeground);
	}
	
	public void setTitle(Color textForeground) {
		JLabel label = new JLabel("Object Detection",JLabel.CENTER);
		label.setText("Object Detection");
		label.setFont(new Font("Tahoma",Font.BOLD,20));
		label.setForeground(textForeground);
		label.setBounds(0,0,this.getWidth(),25);
		this.add(label);
	}
	public void setPresenteBy(Color textForeground) {
		JLabel label = new JLabel("Presented By:",JLabel.CENTER);
		label.setFont(new Font(label.getFont().getFamily(),Font.BOLD,15));
		label.setForeground(textForeground);
		label.setBounds(0,30,this.getWidth(),25);
		this.add(label);
	}
	public void setDeveloperName(Color textForeground) {
		JLabel label = new JLabel("<html><div style='text-align:center'>Group member 1"
				+ "<br>Group member 2" + 
				"<br>Group member 3"
				+ "<br>Group member 4</div></html>",JLabel.CENTER);
		label.setFont(new Font(label.getFont().getFamily(),Font.BOLD,17));
		label.setForeground(textForeground);
		label.setBounds(0,50,this.getWidth(),100);
		this.add(label);
	}
	public void setGuidedBy(Color textForeground) {
		JLabel label = new JLabel("Guided By:",JLabel.CENTER);
		label.setFont(new Font(label.getFont().getFamily(),Font.BOLD,15));
		label.setForeground(textForeground);
		label.setBounds(0,160,this.getWidth(),25);
		this.add(label);
	}
	public void setGuid(Color textForeground) {
		JLabel label = new JLabel("Prof. Full Name",JLabel.CENTER);
		label.setFont(new Font(label.getFont().getFamily(),Font.BOLD,17));
		label.setForeground(textForeground);
		label.setBounds(0,150,this.getWidth(),100);
		this.add(label);
	}
	public void setGuidInfo(Color textForeground) {
		JLabel label = new JLabel("<html><div style='text-align:center'>Asst. Professor, Computer Science and"
				+ "<br>Engineering College Name, Nagpur</div></html>",JLabel.CENTER);
		label.setFont(new Font(label.getFont().getFamily(),Font.BOLD,13));
		label.setForeground(textForeground);
		label.setBounds(0,180,this.getWidth(),100);
		this.add(label);
	}
	

}
