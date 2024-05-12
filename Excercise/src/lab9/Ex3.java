package lab9;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Ex3 {

	private String[] typeArr = { "Sơn Dầu", "Màu sáp" };
	private String[] styleArr = { "Không rõ", "Tự do" };
	private List<Author> authorList = new ArrayList<>();

	public Ex3() {

		authorList.add(new Author("Tác giả 1", "Quốc tịch 1", 1980));
		authorList.add(new Author("Tác giả 2", "Quốc tịch 2", 1990));
		authorList.add(new Author("Tác giả 3", "Quốc tịch 3", 2000));

		JFrame frame = new JFrame("Art Management");
		frame.setLayout(new GridLayout(2, 1));

		JPanel topPanel = new JPanel(new GridLayout(7, 1));

		JPanel panel1 = new JPanel(new FlowLayout());
		JLabel label1 = new JLabel("Quản lý tác phẩm hội họa");
		panel1.add(label1);

		JPanel panel2 = new JPanel(new FlowLayout());
		JLabel label2 = new JLabel("Tên Tác Phẩm: ");
		JTextField textField1 = new JTextField(15);
		panel2.add(label2);
		panel2.add(textField1);

		JPanel panel3 = new JPanel(new FlowLayout());
		JLabel label3 = new JLabel("Năm Sáng Tác: ");
		JTextField textField2 = new JTextField(15);
		panel3.add(label3);
		panel3.add(textField2);

		JPanel panel4 = new JPanel(new FlowLayout());
		JLabel label4 = new JLabel("Loại Tranh: ");
		JComboBox<String> comboBox1 = new JComboBox<String>(typeArr);
		panel4.add(label4);
		panel4.add(comboBox1);

		JPanel panel5 = new JPanel(new FlowLayout());
		JLabel label5 = new JLabel("Phong Cách: ");
		JComboBox<String> comboBox2 = new JComboBox<String>(styleArr);
		panel5.add(label5);
		panel5.add(comboBox2);

		JPanel panel6 = new JPanel(new FlowLayout());
		JLabel label6 = new JLabel("Tác Giả: ");
		JComboBox<Author> comboBox3 = new JComboBox<Author>();
		for (Author author : authorList) {
            comboBox3.addItem(author);
        }
		panel6.add(label6);
		panel6.add(comboBox3);

		JPanel panel7 = new JPanel(new FlowLayout());
		JButton button1 = new JButton("Thêm");
		JButton button2 = new JButton("Xắp Xếp");
		panel7.add(button1);
		panel7.add(button2);

		topPanel.add(panel1);
		topPanel.add(panel2);
		topPanel.add(panel3);
		topPanel.add(panel4);
		topPanel.add(panel5);
		topPanel.add(panel6);
		topPanel.add(panel7);

		JPanel bottomPanel = new JPanel(new BorderLayout());
		JTextArea area = new JTextArea();
		bottomPanel.add(area);
		bottomPanel.setBorder(new TitledBorder("Thông tin về tác phẩm hội họa"));

		frame.add(topPanel);
		frame.add(bottomPanel);

		frame.setSize(400, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex3();
	}
}
