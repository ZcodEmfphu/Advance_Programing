package lab8;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex2 {

	public Ex2() {

		JFrame frame = new JFrame("The front View of a Microware Oven");
		frame.setLayout(new GridLayout(1, 2));

		// Panel left
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		JButton btn1 = new JButton("Food to be placed here");
		panel1.add(btn1);

		// Panel right
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());

		// Panel right top
		JPanel panel21 = new JPanel();
		panel21.setLayout(new BorderLayout());
		JTextField textField = new JTextField();
		textField.setText("Time to be display here");
		panel21.add(textField);

		// Panel right bottom
		JPanel panel22 = new JPanel();
		panel22.setLayout(new GridLayout(4, 3, 2, 2));
		String[] btnArr = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "Start", "End" };
		for (String items : btnArr) {
			JButton btn2 = new JButton(items);
			panel22.add(btn2);
		}

		panel2.add(panel21, BorderLayout.NORTH);
		panel2.add(panel22, BorderLayout.CENTER);

		frame.add(panel1);
		frame.add(panel2);

		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex2();
	}
}
