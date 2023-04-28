package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Gnum1 extends JFrame implements ActionListener{
	private JButton button;
	private JTextField input;
	private JTextArea log;
	private String answer;
	public Gnum1() {
		super("猜三數字");
		button =new JButton("叫你按下去");
		input =new JTextField();
		log =new JTextArea();
		
		setLayout(new BorderLayout());
		JPanel top =new JPanel(new BorderLayout());
		top.add(button,BorderLayout.EAST);
		top.add(input,BorderLayout.CENTER);
		add(top,BorderLayout.NORTH);
		add(log,BorderLayout.CENTER);
		answer=createAns(3);
		button.addActionListener(this);
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main (String[] args) {
		new Gnum1();
		
	}
	public String createAns(int a) {
		int [] num = new int[10];
		int temp;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<10;i++) {
			num[i]=i;
		}
		for(int i=9;i>=0;i--) {
			int z =(int)(Math.random()*9+1);
			temp= num[i]; num[i]=num[z];num[z]=temp;
		}
		for(int i=0;i<a;i++) {
			sb.append(num[i]);
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	public String checkAB(String a) {
		int A,B; A=B=0;
		for(int i=0;i<answer.length();i++) {
			int c = a.charAt(i);
			if(c==answer.charAt(i)) {
				A++;
			}
			else if(answer.indexOf(c)!=-1) {
				B++;
			}
		}
		return String.format("%dA%dB\n",A,B);
	}
	public void actionPerformed(ActionEvent e) {
		boolean isRepeat=false;
		String str1 =input.getText();
		for(int i=0;i<str1.length();i++) {
			System.out.println(); 
			for(int j=0;j<i;j++) {
				if(str1.charAt(i)==str1.charAt(j)) {
					isRepeat =true;
					break;
				}
				}
		}
		if(isRepeat==true) {			
			log.append("請勿輸入重複值\n");
		}
		else if(str1.length()!=answer.length()) {
			log.append(String.format("您輸入了%d碼,請輸入%d碼\n",str1.length(),answer.length()));
		}
		else {
			log.append(checkAB(str1));
			if(checkAB(str1).indexOf("3A")!=-1) {
				log.append("恭喜答對!!\n");
				answer=createAns(3);
			}
		}
	}
}

