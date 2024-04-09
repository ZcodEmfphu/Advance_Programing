package lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainProgram extends JFrame implements ActionListener {

	private Container c;

	private JLabel title;
	private JLabel input, output;
	private JTextArea tinput, toutput;

	public MainProgram() {
		run();
		initComponent();
		setVisible(true);
	}

	private void initComponent() {
		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("String Optional");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(150, 30);
		c.add(title);
		inputCombonent();
		outputCombonent();
		reverseButton();
		palindromeButton();
	}

	private void inputCombonent() {
		input = new JLabel("Input:");
		input.setFont(new Font("Arial", Font.PLAIN, 20));
		input.setSize(100, 20);
		input.setLocation(30, 110);
		c.add(input);

		tinput = new JTextArea();
		tinput.setFont(new Font("Arial", Font.PLAIN, 15));

		tinput.setLineWrap(true);
		tinput.setSize(300, 40);
		tinput.setLocation(100, 100);

		tinput.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		c.add(tinput);
	}

	private void outputCombonent() {
		output = new JLabel("Ouput:");
		output.setFont(new Font("Arial", Font.PLAIN, 20));
		output.setSize(100, 20);
		output.setLocation(30, 210);
		c.add(output);

		toutput = new JTextArea();
		toutput.setFont(new Font("Arial", Font.PLAIN, 15));
		toutput.setSize(300, 40);
		toutput.setLocation(100, 200);

		toutput.setEnabled(false);
		toutput.setLineWrap(true);

		toutput.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		c.add(toutput);
	}

	private void reverseButton() {
		JButton reverseBtn = new JButton();
		reverseBtn = new JButton("Reverse");
		reverseBtn.setFont(new Font("Arial", Font.PLAIN, 15));
		reverseBtn.setSize(100, 50);
		reverseBtn.setLocation(20, 280);
		reverseBtn.addActionListener(this);
		c.add(reverseBtn);
	}

	private void palindromeButton() {
		JButton reverseBtn = new JButton();
		reverseBtn = new JButton("Palind");
		reverseBtn.setFont(new Font("Arial", Font.PLAIN, 15));
		reverseBtn.setSize(100, 50);
		reverseBtn.setLocation(130, 280);
		reverseBtn.addActionListener(this);
		c.add(reverseBtn);
	}

	private void run() {
		setTitle("Lab6");
		setBounds(300, 90, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Reverse")) {
			String inputText = tinput.getText();
			String reversedText = Ex1.reverseString(inputText);
			toutput.setText(" Reverse: " + reversedText);
		}
		if (e.getActionCommand().equals("Palind")) {
			String inputText = tinput.getText();
			boolean isPalindrome = Ex2.isPalindrome(inputText);
			if (isPalindrome) {
				toutput.setText("The string is a palindrome.");
			} else {
				toutput.setText("The string is not a palindrome.");
			}
		}
	}

	public static void main(String[] args) throws Exception {
		MainProgram f = new MainProgram();
	}

}