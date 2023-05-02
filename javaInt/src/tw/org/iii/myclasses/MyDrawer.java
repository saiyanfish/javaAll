package tw.org.iii.myclasses;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import javax.swing.DebugGraphics;
import javax.swing.JPanel;

public class MyDrawer extends JPanel {
	private LinkedList<LinkedList<Point>> lines;
	private LinkedList<LinkedList<Point>> recycleBin;
	public MyDrawer() {
		setBackground(Color.yellow);

		lines = new LinkedList<>();
		recycleBin =new LinkedList<>();
		Mylistener mylistener = new Mylistener();
		addMouseListener(mylistener);
		addMouseMotionListener(mylistener);
	}
	public void clear() {
		lines.clear();	
		repaint();
	}
	public void undo() {
//		lines.remove(lines.getLast());
//		recycleBin.add(lines.getLast());
		if(lines.size()>0) {
			recycleBin.add(lines.removeLast());	
		}
		repaint();
	}
	public void redo() {
		if(recycleBin.size()>0) {
			lines.add(recycleBin.removeLast());	
		}	
		repaint();
	}

	private class Mylistener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			recycleBin.clear();
			LinkedList<Point> line = new LinkedList<>();
			Point point = new Point();
			point.x = e.getX();
			point.y = e.getY();
			line.add(point);
			lines.add(line);
			repaint();
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			Point point = new Point();
			point.x = e.getX();
			point.y = e.getY();
			lines.getLast().add(point);
//			points.add(point);
			repaint();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.blue);
		g2d.setStroke(new BasicStroke(4));
		for (LinkedList<Point> line : lines) {
			for (int i = 1; i < line.size(); i++) {
				Point p0 = line.get(i - 1);
				Point p1 = line.get(i);
				g2d.drawLine(p0.x, p0.y, p1.x, p1.y);
			}

		}
	}

	class Point {
		public int x, y;
	}
}