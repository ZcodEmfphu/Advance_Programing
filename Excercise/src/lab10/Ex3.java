package lab10;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Ex3 {

	public Ex3() {
		JFrame frame = new JFrame("Draw on Component");
		frame.setLayout(new BorderLayout());

		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		JLabel jLabel1 = new JLabel("Add a rectangle by doing mouse press, drag, release");
		panel1.add(jLabel1);

		JPanel panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		JTextPane jTextPane = new JTextPane();
		jTextPane.setEditable(false);
		jTextPane.setPreferredSize(new Dimension(400, 400));
		panel2.add(jTextPane);

		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout());
		JTextPane jTextPane1 = createJTextPane(Color.black);
		JTextPane jTextPane2 = createJTextPane(Color.red);
		JTextPane jTextPane3 = createJTextPane(Color.green);
		JTextPane jTextPane4 = createJTextPane(Color.blue);
		JTextPane jTextPane5 = createJTextPane(Color.orange);
		JTextPane jTextPane6 = createJTextPane(Color.yellow);

		JButton button = new JButton("Clear Drawing");

		panel3.add(jTextPane1);
		panel3.add(jTextPane2);
		panel3.add(jTextPane3);
		panel3.add(jTextPane4);
		panel3.add(jTextPane5);
		panel3.add(jTextPane6);

		panel3.add(button);

		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.CENTER);
		frame.add(panel3, BorderLayout.SOUTH);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		jTextPane.addMouseListener(new Rectangle(jTextPane));
	}

	private JTextPane createJTextPane(Color color) {
		JTextPane textPane = new JTextPane();
		textPane.setPreferredSize(new Dimension(50, 30));
		textPane.setBackground(color);
		return textPane;
	}

	public static void main(String[] args) {
		new Ex3();

	}
}
