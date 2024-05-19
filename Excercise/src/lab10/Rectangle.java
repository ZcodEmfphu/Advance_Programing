package lab10;

import java.awt.*;
import java.awt.event.MouseEvent;

import javax.swing.JTextPane;
import javax.swing.event.MouseInputAdapter;

import lab10.Rectangle;

public class Rectangle extends MouseInputAdapter {
	int x;
	int y;
	int width;
	int height;
	private Color currentColor = Color.BLACK;
	private Color color;
	private JTextPane textPane;
	private Point startPoint;

	public Rectangle(int x, int y, int width, int height) {
		this(x, y, width, height, Color.BLACK);
	}

	public Rectangle(JTextPane textPane) {
		this.textPane = textPane;
	}

	public Rectangle(int x, int y, int width, int height, Color color) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	// Method to draw the rectangle
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, width, height);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		startPoint = e.getPoint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {

		int width = e.getX() - startPoint.x;
		int height = e.getY() - startPoint.y;

		Rectangle rectangle = new Rectangle(startPoint.x, startPoint.y, width, height);

		Graphics g = textPane.getGraphics();
		g.setColor(currentColor);
		g.drawRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
	}

	public void setCurrentColor(Color color) {
		currentColor = color;
	}
}
