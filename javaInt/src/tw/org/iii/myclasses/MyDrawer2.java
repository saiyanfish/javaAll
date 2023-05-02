package tw.org.iii.myclasses;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.DebugGraphics;
import javax.swing.JPanel;

public class MyDrawer2 extends JPanel {
	private LinkedList<Line> lines, recycleBin;
	private Color nowColor;
	private int nowStroke;

	public MyDrawer2() {
		setBackground(Color.YELLOW);
		nowStroke = 5;
		nowColor = Color.BLUE;
		lines = new LinkedList<>();
		recycleBin = new LinkedList<>();

		MyListener myListener = new MyListener();
		addMouseListener(myListener);
		addMouseMotionListener(myListener);
	}

	public Color getColor() {
		return nowColor;
	}

	public void setColor(Color color) {
		nowColor = color;
	}

	public int getStroke() {
		return nowStroke;
	}

	public void changeStrokeSize(int stroke) {
		nowStroke = stroke;
	}

	public void clear() {
		lines.clear();
		repaint();
	}

	public void undo() {
		if (lines.size() > 0) {
			recycleBin.add(lines.removeLast());
			repaint();
		}
	}

	public void redo() {
		if (recycleBin.size() > 0) {
			lines.add(recycleBin.removeLast());
			repaint();
		}
	}

	public boolean saveLines(String filename) {
		try (FileOutputStream fin = new FileOutputStream(filename);
				ObjectOutputStream oout = new ObjectOutputStream(fin)) {
			oout.writeObject(lines);
			oout.flush();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	public boolean loadLines(String filename) {
		try (ObjectInputStream ooin =new ObjectInputStream(new FileInputStream(filename))){
			lines=(LinkedList<Line>) ooin.readObject();
			repaint();
			recycleBin.clear();
			return true;
		}catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}
	public void saveJPEG() {
		BufferedImage img =new BufferedImage(getWidth(), getHeight(),BufferedImage.TYPE_INT_RGB );
		Graphics2D g2d= img.createGraphics();
		paint(g2d);
		
		try {
			ImageIO.write(img, "jpeg", new File("dir1/liness.jpg"));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new java.awt.BasicStroke(4));

		for (Line line : lines) {
			g2d.setStroke(new java.awt.BasicStroke(line.getStroke()));
			g2d.setColor(line.getColor());
			for (int i = 1; i < line.size(); i++) {
				Point p0 = line.getPoint(i - 1);
				Point p1 = line.getPoint(i);
				g2d.drawLine(p0.x, p0.y, p1.x, p1.y);
			}
		}

	}

	private class MyListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			Line line = new Line(nowColor, nowStroke);

			Point point = new Point();
			point.x = e.getX();
			point.y = e.getY();
			line.addPoint(point);
			lines.add(line);

			repaint();
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			Point point = new Point();
			point.x = e.getX();
			point.y = e.getY();

			lines.getLast().getPoints().add(point);

			repaint();
		}
	}
}

class Line implements Serializable {
	private int Stroke;
	private Color color;
	private LinkedList<Point> points;

	Line(Color color, int stroke) {
		this.color = color;
		this.Stroke = stroke;
		points = new LinkedList<>();
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setStroke(int stroke) {
		this.Stroke = stroke;
	}

	public int getStroke() {
		return Stroke;
	}

	public LinkedList<Point> getPoints() {
		return points;
	}

	public void setPoints(LinkedList<Point> points) {
		this.points = points;
	}

	public void addPoint(Point point) {
		points.add(point);
	}

	public Point getPoint(int index) {
		return points.get(index);
	}

	public int size() {
		return points.size();
	}
}

class Point implements Serializable{
	public int x, y;
}