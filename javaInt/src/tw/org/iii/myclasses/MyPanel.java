package tw.org.iii.myclasses;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private BufferedImage ball;
	private Timer timer;
	private BufferedImage[] imgs; 
	private int  viewX, viewY;
	private LinkedList<BallTask> balls;
	
	public MyPanel() {
		setBackground(Color.yellow);

		try {
			imgs =new BufferedImage[4];
			imgs[0] = ImageIO.read(new File("dir1/ball1.png"));			
			imgs[1] = ImageIO.read(new File("dir1/ball2.png"));
			imgs[2] = ImageIO.read(new File("dir1/ball1.png"));
			imgs[3] = ImageIO.read(new File("dir1/ball2.png"));

		} catch (IOException e) {
		}
		
		balls =new LinkedList<>();
		timer = new Timer();
		timer.schedule(new RefreshView(), 0, 16);
		addMouseListener(new MymouseListener());
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		viewX = getWidth();
		viewY = getHeight();
		Graphics2D g2d = (Graphics2D) g;
		for(BallTask ball:balls) {
		g2d.drawImage(imgs[ball.img], ball.x, ball.y, null);}

	}
	private class MymouseListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getX()-40>0 &&e.getY()-40>0 
				&&e.getX()+40<viewX&&e.getY()+40<viewY ) {
				BallTask ball =new BallTask(e.getX()-40,e.getY()-40);
				
				balls.add(ball);
				timer.schedule(ball, 100,30);	
			}
			
		}
	}
	private class RefreshView extends TimerTask{
		@Override
		public void run() {
			repaint();
		}
	}
	private class BallTask extends TimerTask {
		public int x,y,dx,dy,img;  ///get set
		public BallTask(int x,int y){
			this.x =x; this.y=y;
			for(;dx==0;	dx=(int)((Math.random()*15)-7)) 
			for(;dy==0; dy=(int)((Math.random()*15)-7))
			img =(int)(Math.random()*4);
		}
		
		@Override
		public void run() {
			if(x<=0 ||x+80>=viewX) {
				dx*=-1;
			}
			if(y<=0 ||y+80>=viewY) {
				dy*=-1;
			}
			x += dx;
			y += dy;
			
		}

	}
}
