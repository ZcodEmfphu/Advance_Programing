package lab10;

import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex1 {

	private JFrame frame;
	private JPanel panel;
	private boolean isWhite;

	public Ex1() {
		frame = new JFrame("Chess Board");
		panel = new JPanel(new GridLayout(7, 7));
		isWhite = true;

		setupBoard();

		frame.add(panel);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		Timer timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeColors();
			}
		});
		timer.start();
	}

	public void setupBoard() {
		for (int row = 0; row < 7; row++) {
			for (int col = 0; col < 7; col++) {
				JPanel square = new JPanel();
				if (isWhite) {
					square.setBackground(Color.WHITE);
				} else {
					square.setBackground(Color.BLACK);
				}

				square.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
				panel.add(square);
				isWhite = !isWhite;
			}

		}
	}

	public void changeColors() {
		Component[] components = panel.getComponents();
		for (Component component : components) {
			if (component instanceof JPanel) {
				JPanel square = (JPanel) component;
				if (square.getBackground() == Color.WHITE) {
					square.setBackground(Color.BLACK);
				} else {
					square.setBackground(Color.WHITE);
				}
			}
		}
	}

	public static void main(String[] args) {
		new Ex1();
	}
}
