package tw.org.iii.tutor;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ii21 extends JFrame {
	private JButton b1;
	public ii21() {
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My Window");
//		FlowLayout B1=new FlowLayout();
//		setLayout(B1);
		setLayout(new FlowLayout());
		b1 =new JButton("按我");
		add(b1);
	} //Constructer
	public static void main(String[] args) {
		new ii21();
	}

}
