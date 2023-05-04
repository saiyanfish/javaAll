package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tw.org.iii.myclasses.Clock;

public class AutoClock extends JFrame{
	private Clock clock;
	private JButton bt;
	AutoClock(){
		Timer timer =new Timer();
		timer.schedule(new timertask(), 0, 1000);
		clock =new Clock();
		
		setLayout(new BorderLayout());
		
		
		add(clock,BorderLayout.CENTER);
	
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 400);
	
	}
	
	
	public static void main(String[] args) {
		new AutoClock();
		
	}
class timertask extends TimerTask{
		private SimpleDateFormat sd;
		@Override
		public void run() {
			sd =new SimpleDateFormat("hhmmssSS");
			String s=sd.format(new Date()).substring(4,6);
			String m=sd.format(new Date()).substring(2,4);
			String h=sd.format(new Date()).substring(0,2);
			String ms=sd.format(new Date()).substring(6,8);
			clock.secs= Integer.parseInt(s);
			clock.min= Integer.parseInt(m);
			clock.hr= Integer.parseInt(h);
//			clock.ms=Integer.parseInt(ms);
//			System.out.println(clock.secs);
			repaint();
		}
		
	}

}
	
	