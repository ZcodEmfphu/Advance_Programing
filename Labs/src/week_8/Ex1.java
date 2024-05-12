package week_8;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex1 {

	public Ex1() {
		JFrame frame = new JFrame("Caculator");
		frame.setLayout(new GridLayout(5, 1));

		JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel label1 = new JLabel("Số thứ tự 1: ");
		JTextField textField1 = new JTextField(10);

		panel1.add(label1);
		panel1.add(textField1);

		JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

		JButton button1 = new JButton("+");
		JButton button2 = new JButton("-");
		JButton button3 = new JButton("*");
		JButton button4 = new JButton("/");

		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);

		JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel label3 = new JLabel("Số thứ tự 2: ");
		JTextField textField3 = new JTextField(10);

		panel3.add(label3);
		panel3.add(textField3);

		JPanel panel4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JButton centerButton = new JButton("=");

		panel4.add(centerButton);

		JPanel panel5 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel label5 = new JLabel("Kết quả: ");
		JTextField textField5 = new JTextField(10);

		panel5.add(label5);
		panel5.add(textField5);

		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel4);
		frame.add(panel5);

		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex1();

	}

}
