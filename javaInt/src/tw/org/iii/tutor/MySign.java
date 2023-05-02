package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import tw.org.iii.myclasses.MyDrawer;
import tw.org.iii.myclasses.MyDrawer2;
import tw.org.iii.myclasses.MyDrawer3;

public class MySign extends JFrame {
	
	private MyDrawer2 myDrawer;
	private JButton clear, undo, redo,chColor,chStroke;
	private JTextField stroke;
	private JButton save,load,savejpg;
	public MySign() {
		super("Sign");

		myDrawer = new MyDrawer2();
		setLayout(new BorderLayout());
		add(myDrawer, BorderLayout.CENTER);
		
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		chColor=new JButton("chColor");
		stroke =new JTextField();
		stroke.setColumns(3);
		chStroke =new JButton("chStroke");
		save =new JButton("Save obj");
		load =new JButton("Load obj");
		savejpg=new JButton("save jpeg");
		
		JPanel top = new JPanel(new FlowLayout());
		top.add(clear);
		top.add(undo);
		top.add(redo);
		top.add(chColor);
		top.add(save);
		top.add(load);
		top.add(chStroke);
		top.add(stroke);
		top.add(savejpg);
		
		add(top, BorderLayout.NORTH);

		clear.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.clear();
			}
		});
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.undo();
			}
		});
		redo.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.redo();
			}
		});
		chColor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeColor();
			}
		});
		chStroke.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeStrokesize() ;
			}
		});
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveObj();
			}
		});
		load.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				loadObj();
			}
		});
		savejpg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.saveJPEG();
			}
		});
		setSize(800, 640);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void changeColor(){
		Color newColor = JColorChooser.showDialog
				(null, "Change Color", myDrawer.getColor());
		if(newColor !=null) {
			myDrawer.setColor(newColor);
		}
	}
	private void changeStrokesize() {
		int newStroke ;	
		if(stroke.getText().matches("[0-9]*")) {
			newStroke=Integer.parseInt(stroke.getText());			
			myDrawer.changeStrokeSize(newStroke);
		}else if(stroke.getText().matches("[\u4e00-\u9fa5]*")) {
			JOptionPane.showMessageDialog(null,"請勿輸入中文");
		}
		else {
			JOptionPane.showMessageDialog(null,"請輸入數字");
		}
	}
	private void saveObj() {
		JFileChooser jfc =new JFileChooser();
		if(jfc.showSaveDialog(null)==JFileChooser.APPROVE_OPTION) {
			File file =jfc.getSelectedFile();
			myDrawer.saveLines(file.getAbsolutePath());
		}
	}
	private void loadObj() {
		JFileChooser jfc=new JFileChooser();
		if(jfc.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) {
			File file =jfc.getSelectedFile();
			myDrawer.loadLines(file.getAbsolutePath());
		}
	}
	
	
	public static void main(String[] args) {
		new MySign();
	}

}
