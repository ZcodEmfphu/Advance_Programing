package lab8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Ex2 {

	public Ex2() {
		JFrame frame = new JFrame("Ex2");
		frame.setLayout(new GridLayout(3, 1));

		JPanel panel1 = new JPanel(new BorderLayout());
		JPanel textPanel = new JPanel(new BorderLayout());

		textPanel.setBorder(new EmptyBorder(10, 10, 0, 10));

		JLabel titleLabel = new JLabel("Thay đổi tính hiệu đèn giao thông");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

		JTextArea textArea = new JTextArea();
		textArea.setText("- Đỏ\n- Xanh\n- Vàng: Bạn chọn màu vàng!");

		textArea.setBorder(new LineBorder(Color.BLUE, 2));
		textArea.setEditable(false);
		textArea.setEnabled(false);
		Font font = new Font(Font.SANS_SERIF, Font.BOLD, 12);
		textArea.setFont(font);

		textPanel.add(titleLabel, BorderLayout.NORTH);
		textPanel.add(textArea, BorderLayout.CENTER);
		panel1.add(textPanel, BorderLayout.CENTER);

		JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel label = new JLabel("Chọn loài đèn: ");
		JRadioButton radioButton1 = new JRadioButton("Đỏ");
		JRadioButton radioButton2 = new JRadioButton("Xanh");
		JRadioButton radioButton3 = new JRadioButton("Vàng");

		ButtonGroup group = new ButtonGroup();
		group.add(radioButton1);
		group.add(radioButton2);
		group.add(radioButton3);
		radioButton3.setSelected(true);

		panel2.add(label);
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
