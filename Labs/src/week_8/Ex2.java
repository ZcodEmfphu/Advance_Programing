package week_8;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class Ex2 {

	public Ex2() {

		JFrame frame = new JFrame("Traffic Light Program");
		frame.setLayout(new GridLayout(3, 1));

		JPanel panel1 = new JPanel(new GridLayout(3, 1));
		panel1.setBorder(new TitledBorder("Thay đổi tính hiệu đèn giao thông"));

		JLabel lable1 = new JLabel();
		JLabel lable2 = new JLabel();
		JLabel lable3 = new JLabel();

		lable1.setText("- Đỏ");
		lable2.setText("- Xanh");
		lable3.setText("- Vàng: Bạn chọn màu vàng!");

		panel1.add(lable1);
		panel1.add(lable2);
		panel1.add(lable3);

		JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel label4 = new JLabel("Chọn loài đèn: ");
		JRadioButton radioButton1 = new JRadioButton("Đỏ");
		JRadioButton radioButton2 = new JRadioButton("Xanh");
		JRadioButton radioButton3 = new JRadioButton("Vàng");

		ButtonGroup group = new ButtonGroup();
		group.add(radioButton1);
		group.add(radioButton2);
		group.add(radioButton3);
		radioButton3.setSelected(true);

		panel2.add(label4);
		panel2.add(radioButton1);
		panel2.add(radioButton2);
		panel2.add(radioButton3);

		frame.add(panel1);
		frame.add(panel2);

		frame.setSize(300, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex2();
	}

}
