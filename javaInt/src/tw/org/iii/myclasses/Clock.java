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
	private int r =50;
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
		///時鐘數字
		
		
		
		
		Graphics2D g2d=(Graphics2D)g;
		g2d.setStroke(new BasicStroke(3));
		g2d.setColor(Color.blue);
		g2d.drawOval(startr, startr, 2*r, 2*r);
		
		g2d.setColor(Color.WHITE);
		g2d.drawLine(startr+r, startr+r, (int)(startr+r+48*cos),(int)(startr+r+48*sin));
		g2d.setColor(Color.CYAN);
		g2d.drawLine(startr+r, startr+r, (int)(startr+r+40*mincos),(int)(startr+r+40*minsin));
		g2d.setColor(Color.red);
		g2d.drawLine(startr+r, startr+r, (int)(startr+r+30*hrcos),(int)(startr+r+30*hrsin));
		for(int a=1;a<10;a++) {
			g2d.setStroke(new BasicStroke(2));
			g2d.setColor(Color.white);
			double strdegrees = (a*30-90);
			double strradians = Math.toRadians(strdegrees); 
			double strsin=Math.sin(strradians);
			double strcos= Math.cos(strradians);
			String astr=Integer.toString(a);
			
			g2d.drawString(astr, (int)(startr+r+46*strcos-4),(int)(startr+r+46*strsin)+4);
		}
		for(int a=10;a<13;a++) {
			g2d.setStroke(new BasicStroke(2));
			g2d.setColor(Color.white);
			double strdegrees = (a*30-90);
			double strradians = Math.toRadians(strdegrees); 
			double strsin=Math.sin(strradians);
			double strcos= Math.cos(strradians);
			String astr=Integer.toString(a);
			
			g2d.drawString(astr, (int)(startr+r+46*strcos-7),(int)(startr+r+46*strsin)+6);
		}
	}
	
		

	}

