package tw.org.iii.tutor;

import javax.swing.JFrame;

import tw.org.iii.myclasses.Idclass;

public class IdCreate extends JFrame{
	
	public IdCreate() {
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(getLayout());
	}

	public static void main(String[] args) {
		Idclass idcreate =new Idclass();
		new IdCreate();
	}

}
