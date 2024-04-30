package lab8;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex6 implements ActionListener {

	private JFrame frame;
	private JLabel label;
	private JPanel panel1, panel2;
	private JComboBox<String> combobox;
	private String[] imagePaths = { "src/lab8/img/bug1.png", "src/lab8/img/bug2.png", "src/lab8/img/bug3.png" };

	public Ex6() {
		frame = new JFrame("Testing Jcombobox");
		frame.setLayout(new BorderLayout());

		panel1 = new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER));

		String[] bug = { "bug1.png", "bug2.png", "bug3.png" };
		combobox = new JComboBox<String>(bug);
		panel1.add(combobox);

		panel2 = new JPanel();
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER));

		label = new JLabel();
		panel2.add(label);

		combobox.addActionListener(this);
		combobox.setSelectedItem("bug1.png");

		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.CENTER);

		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int selectedIndex = combobox.getSelectedIndex();
		String path = imagePaths[selectedIndex];
		ImageIcon imageIcon = new ImageIcon(path);

		label.setIcon(imageIcon);
	}

	public static void main(String[] args) {
		new Ex6();
	}

}
