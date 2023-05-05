package tw.org.iii.myclasses;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.geom.Line2D;
import java.util.Timer;

import javax.swing.JPanel;

public class Clock extends JPanel{
	public int ms;
	public int secs;
	public int min;
	public int hr;
	public int inix ,iniy ;
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
		
		
		
		
		
		Graphics2D g2d=(Graphics2D)g;
		g2d.setStroke(new BasicStroke(3));
		g2d.setColor(Color.blue);
		g2d.drawOval(inix, iniy, 2*r, 2*r);
		
		g2d.setColor(Color.WHITE);
		Line2D.Double line =new Line2D.Double(inix+r, iniy+r, (inix+r+48*cos),(iniy+r+48*sin));
		g2d.draw(line);
//		g2d.drawLine(inix+r, iniy+r, (int)(inix+r+48*cos),(int)(iniy+r+48*sin));
		
		g2d.setColor(Color.CYAN);
		g2d.drawLine(inix+r, iniy+r, (int)(inix+r+40*mincos),(int)(iniy+r+40*minsin));
		Line2D.Double line2 =new Line2D.Double(inix+r, iniy+r, (inix+r+40*mincos),(iniy+r+40*minsin));
		g2d.draw(line2);
		g2d.setColor(Color.red);
		g2d.drawLine(inix+r, iniy+r, (int)(inix+r+30*hrcos),(int)(iniy+r+30*hrsin));
		for(int a=1;a<10;a++) {
			g2d.setStroke(new BasicStroke(2));
			g2d.setColor(Color.white);
			double strdegrees = (a*30-90);
			double strradians = Math.toRadians(strdegrees); 
			double strsin=Math.sin(strradians);
			double strcos= Math.cos(strradians);
			String astr=Integer.toString(a);
			
			g2d.drawString(astr, (int)(inix+r+46*strcos-4),(int)(iniy+r+46*strsin)+4);
		}
		for(int a=10;a<13;a++) {
			g2d.setStroke(new BasicStroke(2));
			g2d.setColor(Color.white);
			double strdegrees = (a*30-90);
			double strradians = Math.toRadians(strdegrees); 
			double strsin=Math.sin(strradians);
			double strcos= Math.cos(strradians);
			String astr=Integer.toString(a);
			
			g2d.drawString(astr, (int)(inix+r+46*strcos-7),(int)(iniy+r+46*strsin)+6);
		}
	}
	
		

	}

