package lab8;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Ex7 implements ListSelectionListener {
	private JFrame frame;
	private JPanel panel1;
	private JList<String> list;
	private String[] colors = { "Black", "Blue", "Cyan", "DARK_GRAY", "GRAY", "Green", "LIGHT_GRAY", "Magenta",
			"Orange", "Pink", "Red", "White", "Yellow" };

	public Ex7() {
		frame = new JFrame("List Demo");

		panel1 = new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER));

		list = new JList<>(colors);
		panel1.add(list);

		list.addListSelectionListener(this);

		frame.add(panel1);

		frame.setSize(300, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		int selectedIndex = list.getSelectedIndex();
		String selectedColor = colors[selectedIndex];

		panel1.setBackground(getColorFromString(selectedColor));

	}

	private Color getColorFromString(String colorName) {
		try {
			return (Color) Color.class.getField(colorName.toUpperCase()).get(null);
		} catch (Exception ex) {
			return Color.BLACK;
		}
	}

	public static void main(String[] args) {
		new Ex7();
	}

}
