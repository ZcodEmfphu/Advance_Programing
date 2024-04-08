package lab6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Swing extends JFrame {

	private JTextArea textArea;

	public Swing() {
		initComponents();
		run();
	}

	private void initComponents() {

		JPanel containerPanel = new JPanel(new GridLayout(3, 1));

		JPanel panel1 = new JPanel(new BorderLayout());
		
		JLabel label1 = new JLabel("Nhãn:");
		JTextArea textArea1 = new JTextArea();
		
		textArea1.setLineWrap(true);

		panel1.add(label1, BorderLayout.NORTH);
		panel1.add(textArea, BorderLayout.CENTER);
		
//		panel1.add(textArea1);
//		panel1.add(label1);
		
		panel1.setBackground(Color.cyan);

		JPanel panel2 = new JPanel();
//		panel2.setBackground(Color.GREEN);
		JLabel label2 = new JLabel("Panel 2");
		panel2.add(label2);

		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.BLUE);
		JLabel label3 = new JLabel("Panel 3");
		panel3.add(label3);

		containerPanel.add(panel1);
		containerPanel.add(panel2);
		containerPanel.add(panel3);

		this.add(containerPanel);
	}

	private void run() {
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Swing app = new Swing();
	}
}