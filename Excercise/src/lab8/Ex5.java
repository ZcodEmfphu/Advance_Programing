package lab8;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ex5 {

	private JFrame frame = new JFrame("Khảo sát thông tin");
	private JLabel label1, label2, label3, label4;
	private JTextField textField1, textField2, textField3, textField4, textField5;

	public Ex5() {

		topPanel();
		middlePanel();
		bottomPanel();

		frame.setSize(450, 200);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public void topPanel() {

		label1 = new JLabel("Họ Tên:");
		label1.setSize(60, 40);
		label1.setLocation(10, 10);

		textField1 = new JTextField("Trần Thị Thanh Nga");
		textField1.setSize(150, 30);
		textField1.setLocation(100, 15);

		textField2 = new JTextField("Trần Thị Thanh Nga");
		textField2.setSize(150, 30);
		textField2.setLocation(260, 15);
		textField2.setEditable(false);

		frame.add(label1);
		frame.add(textField1);
		frame.add(textField2);

	}

	public void middlePanel() {

		label2 = new JLabel("Nam");
		label2.setSize(60, 40);
		label2.setLocation(10, 50);

		JRadioButton radioBtn1 = new JRadioButton();
		radioBtn1.setSize(20, 40);
		radioBtn1.setLocation(100, 50);

		label3 = new JLabel("Nữ");
		label3.setSize(60, 40);
		label3.setLocation(150, 50);

		JRadioButton radioBtn2 = new JRadioButton("Nữ");
		radioBtn2.setSize(20, 40);
		radioBtn2.setLocation(220, 50);
		radioBtn2.setSelected(true);

		textField3 = new JTextField("Nữ");
		textField3.setSize(150, 30);
		textField3.setLocation(260, 50);
		textField3.setEditable(false);

		frame.add(label2);
		frame.add(radioBtn1);
		frame.add(label3);
		frame.add(radioBtn2);
		frame.add(textField3);
	}

	public void bottomPanel() {
		label4 = new JLabel("Số tiền:");
		label4.setSize(60, 40);
		label4.setLocation(10, 90);

		textField4 = new JTextField("2000000");
		textField4.setSize(150, 30);
		textField4.setLocation(100, 90);

		textField5 = new JTextField("2,000,000");
		textField5.setSize(150, 30);
		textField5.setLocation(260, 90);
		textField5.setEditable(false);

		frame.add(label4);
		frame.add(textField4);
		frame.add(textField5);
	}

	public static void main(String[] args) {
		new Ex5();
	}
}
