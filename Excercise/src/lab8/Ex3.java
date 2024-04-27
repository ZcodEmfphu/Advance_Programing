package lab8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex3 {

	public Ex3() {
		
		JFrame frame = new JFrame("Basic Cacular");
		frame.setLayout(new BorderLayout());

		JPanel panel1 = new JPanel(new BorderLayout());
		panel1.setBackground(Color.WHITE);

		JTextField textField = new JTextField();
		panel1.add(textField, BorderLayout.CENTER);

		JPanel panel2 = new JPanel(new GridLayout(4, 4, 5, 5));
		panel2.setBackground(Color.LIGHT_GRAY);

		String[] buttonLabels = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+" };
		for (String label : buttonLabels) {
			JButton button = new JButton(label);
			button.setBackground(Color.WHITE);
			button.setOpaque(true);
			button.setBorderPainted(false);
			panel2.add(button);
		}

		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.CENTER);

		frame.setSize(300, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex3();
	}

}
