package tw.org.iii.tutor;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import tw.org.iii.myclasses.MyPanel;

public class BallGame extends JFrame{
	private MyPanel mypanel;
	public BallGame(){
	super("Ball Game");
	
	setLayout(new BorderLayout());
	mypanel =new MyPanel();
	
	add(mypanel,BorderLayout.CENTER);
	setSize(640, 480);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new BallGame();
	}
}
