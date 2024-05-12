package lab9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex2 extends JPanel {

	private Color circle1Color = Color.BLACK;
	private Color circle2Color = Color.BLACK;
	private Color circle3Color = Color.BLACK;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(circle1Color);
		g.fillOval(40, 20, 80, 80);

		g.setColor(circle2Color);
		g.fillOval(160, 20, 80, 80);

		g.setColor(circle3Color);
		g.fillOval(280, 20, 80, 80);
	}

	public Dimension getPreferredSize() {
		return new Dimension(250, 100);
	}

	public Ex2() {
		JFrame frame = new JFrame("Light Traffic Program 2");
		frame.setLayout(new BorderLayout());

		JPanel panel = new JPanel(new FlowLayout());
		JLabel label = new JLabel("Chọn loại đèn: ");
		JRadioButton btn1 = new JRadioButton("Đỏ");
		JRadioButton btn2 = new JRadioButton("Vàng");
		JRadioButton btn3 = new JRadioButton("Xanh");

		panel.add(label);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(btn1);
		buttonGroup.add(btn2);
		buttonGroup.add(btn3);

		btn1.addActionListener(e -> {
			circle1Color = Color.RED;
			circle2Color = Color.BLACK;
			circle3Color = Color.BLACK;
			repaint();
		});

		btn2.addActionListener(e -> {
			circle1Color = Color.BLACK;
			circle2Color = Color.YELLOW;
			circle3Color = Color.BLACK;
			repaint();
		});

		btn3.addActionListener(e -> {
			circle1Color = Color.BLACK;
			circle2Color = Color.BLACK;
			circle3Color = Color.GREEN;
			repaint();
		});

		frame.add(panel, BorderLayout.SOUTH);
		frame.add(this, BorderLayout.NORTH);

		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex2();
	}
}
