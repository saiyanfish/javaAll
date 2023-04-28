package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class paintTools extends JFrame{
	private JButton a;
	paintTools() {
		super("Sign");
		a=new JButton("azxs") ;
		JPanel top =new JPanel(new FlowLayout());	
		top.add(a);
		add(top,BorderLayout.NORTH);
		
		
		a.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		setSize(800, 640);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new paintTools();
	}

}
