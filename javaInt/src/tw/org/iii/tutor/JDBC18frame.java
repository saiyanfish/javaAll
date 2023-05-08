package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import tw.org.iii.myclasses.MyTable;

public class JDBC18frame extends JFrame {
	private MyTable mytable;
	private JButton delete;
	public JDBC18frame() {
		setLayout(new BorderLayout());
		JPanel top =new JPanel(new FlowLayout());
		delete =new JButton("delete");
		add(top.add(delete),BorderLayout.NORTH);
		delete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			delData();
			}
		});
		try {
			mytable =new MyTable();
			
			JScrollPane jsp =new JScrollPane(mytable);

			add(jsp, BorderLayout.CENTER);
			setVisible(true);
			setSize(800, 640);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		} catch (Exception e) {
			System.exit(87);
		}
		
		
	}
	private void delData() {
		mytable.delRow();
		
	}
	public static void main(String args[]) {
		new JDBC18frame();
	}
}
