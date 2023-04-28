package tw.org.iii.tutor;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class II32 extends JFrame implements ActionListener {
	private JButton b1, b2, b3;

	public II32() {
		b1 = new JButton("B1");
		b2 = new JButton("B2");
		b3 = new JButton("B3");

		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("b1");
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("b2");

			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("b3");

			}
		});
		
//		b1.addActionListener(this);
//		b2.addActionListener(this);
//		b3.addActionListener(this);
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new II32();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			System.out.println("b1");
		} else if (e.getSource() == b2) {
			System.out.println("b2");
		} else if (e.getSource() == b3) {
			System.out.println("b3");
		}
	}
}

class MylistenerV1 implements ActionListener {
	private String who;

	public MylistenerV1(String who) {
		this.who = who;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("A" + who);
		e.getActionCommand();
	}

}
