package tw.org.iii.myclasses;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private BufferedImage ball;
	private Timer timer;
	private int ballX, ballY, viewX, viewY,dx,dy;

	public MyPanel() {
		setBackground(Color.yellow);

		try {
			ball = ImageIO.read(new File("dir1/ball.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		ballX = ballY = 90;
		dx=dy=2;
		timer = new Timer();
		timer.schedule(new BallTask(), 1000, 20);
		addMouseListener(new MymouseListener());
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		viewX = getWidth();
		viewY = getHeight();
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(ball, ballX, ballY, null);

	}
	private class MymouseListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			
		}
	}

	private class BallTask extends TimerTask {
		@Override
		public void run() {
			if(ballX<=0 ||ballX+80>=viewX) {
				dx*=-1;
			}
			if(ballY<=0 ||ballY+80>=viewY) {
				dy*=-1;
			}
			ballX += dx;
			ballY += dy;
			repaint();
		}

	}
}
