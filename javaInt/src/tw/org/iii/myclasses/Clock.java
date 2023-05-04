package tw.org.iii.myclasses;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Timer;

import javax.swing.JPanel;

public class Clock extends JPanel{
	public int ms;
	public int secs;
	public int min;
	public int hr;
	private int startr =100;
	
	public Clock(){

		setBackground(Color.black);
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		double degrees = secs*6+270;
		double radians = Math.toRadians(degrees); 
		double sin=Math.sin(radians);
		double cos= Math.cos(radians);
		double mindegrees = (min*6+270)+(secs/30);
		double minradians = Math.toRadians(mindegrees); 
		double minsin=Math.sin(minradians);
		double mincos= Math.cos(minradians);
		double hrdegrees = (hr*30-90)+(min*0.5);
		double hrradians = Math.toRadians(hrdegrees); 
		double hrsin=Math.sin(hrradians);
		double hrcos= Math.cos(hrradians);
		
		
		
		Graphics2D g2d=(Graphics2D)g;
		g2d.setStroke(new BasicStroke(3));
		g2d.setColor(Color.blue);
		g2d.drawOval(startr, startr, 100, 100);
		
		g2d.setColor(Color.WHITE);
		g2d.drawLine(startr+50, startr+50, (int)(startr+50+48*cos),(int)(startr+50+48*sin));
		g2d.setColor(Color.CYAN);
		g2d.drawLine(startr+50, startr+50, (int)(startr+50+40*mincos),(int)(startr+50+40*minsin));
		g2d.setColor(Color.red);
		g2d.drawLine(startr+50, startr+50, (int)(startr+50+30*hrcos),(int)(startr+50+30*hrsin));
	
	}
	
		

	}

