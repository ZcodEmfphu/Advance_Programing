package lab10;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Ex2 extends JPanel {

	private int x = 170;
	private int y = 100;
	private int xSpeed = 2;
	private int ySpeed = 2;
	private int diameter = 30;

	public Ex2() {
		Timer timer = new Timer(10, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moveBall();
				repaint();
			}
		});
		timer.start();

		JFrame frame = new JFrame("Bouncing Ball");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		frame.add(this);
		frame.setVisible(true);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillOval(x, y, diameter, diameter);
	}

	private void moveBall() {

		if (x + xSpeed < 0 || x + diameter + xSpeed > getWidth()) {
			xSpeed = -xSpeed;
		}
		if (y + ySpeed < 0 || y + diameter + ySpeed > getHeight()) {
			ySpeed = -ySpeed;
		}
		x += xSpeed;
		y += ySpeed;
	}

	public Dimension getPreferredSize() {
		return new Dimension(400, 300);
	}

	public static void main(String[] args) {
		new Ex2();
	}
}
