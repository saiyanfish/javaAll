package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GNum extends JFrame implements ActionListener{

	private JButton guess;
	private JTextField input;
	private JTextArea log;
	private String answer;
	private int counter;
	
	public GNum() {
		super("猜數字遊戲");
		
		guess =new JButton("猜");
		input =new JTextField();
		log =new JTextArea();
		
		setLayout(new BorderLayout());
		JPanel top =new JPanel(new BorderLayout());
		top.add(guess,BorderLayout.EAST);
		top.add(input,BorderLayout.CENTER);
		//CENTER 東南西北剩下的
		add(top,BorderLayout.NORTH);
		add(log,BorderLayout.CENTER);
		
//		guess.addActionListener(new Ilistener());
		guess.addActionListener(this);
		setView();
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		newGame();
//		answer=createAns(3);
	}
	public static void main(String[] args) {
		GNum aa =new GNum();
		
	}
	private void setView() {
		input.setFont(new Font(null,Font.BOLD,24));
		log.setFont(new Font(null, Font.BOLD|Font.ITALIC,18));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		counter++;
		String strInput = input.getText();
//		log.setText(strInput);
//		log.append(strInput+"\n");
		
		if(strInput.length()==answer.length()) {
			String result =checkAB(strInput);
			log.append(strInput+"=>"+result+"\n");
				if(result.equals("3A0B")) {
					JOptionPane.showMessageDialog(null,"Congrats");
					newGame();
				}
				else if(counter==10) {
					JOptionPane.showMessageDialog(null, "You lose answer="+answer);
					newGame();
				}
		}
		else {
			log.append(String.format("請輸入%d位數\n",answer.length()));
		}
	}
	private void newGame() {
		answer =createAns(3);
		System.out.println(answer);
		log.setText("");
		input.setText("");
		counter =0;
	}
	private String createAns(int n) {
		int [] poker;
		poker = new int[10];
		for(int i=0;i<poker.length;i++) {
			poker[i]=i;
		};
		
		for(int i=9;i>0;i--) {
			int z =(int)(Math.random()*(i+1));
			int temp;
			temp =poker[i];
			poker[i]=poker[z];
			poker[z]=temp;
		}
		StringBuffer sb =new StringBuffer();
		for(int i=0;i<n;i++) {
			sb.append(poker[i]);
		}
		return sb.toString();
	}

	private String checkAB(String g) {
		int A,B; A=B=0;
		for(int i=0;i<g.length();i++) {
			char c =g.charAt(i);
			if(c==answer.charAt(i)) {
				A++;
			}else if(answer.indexOf(c)!=-1) {
				B++;
			}
		}
		return String.format("%dA%dB",A,B );
	}
class Ilistener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("OK");
	}
	
}
}