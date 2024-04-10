package lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainProgram extends JFrame implements ActionListener {

	private Container c;

	private JLabel title;
	private JLabel input1, input2, output;
	private JTextArea tinput1, tinput2, toutput;

	public MainProgram() {
		initComponent();
		setVisible(true);
	}

	private void initComponent() {
		setTitle("Lab6");
		setBounds(300, 90, 700, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("String Optional");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(250, 30);
		c.add(title);
		inputCombonent();
		outputCombonent();
		optionButton();
	}

	private void inputCombonent() {

		input1 = new JLabel("Input:");
		input1.setFont(new Font("Arial", Font.PLAIN, 20));
		input1.setSize(100, 20);
		input1.setLocation(30, 110);
		c.add(input1);

		tinput1 = new JTextArea();
		tinput1.setFont(new Font("Arial", Font.PLAIN, 15));

		tinput1.setLineWrap(true);
		tinput1.setSize(200, 40);
		tinput1.setLocation(100, 100);

		tinput1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		c.add(tinput1);

		input2 = new JLabel("Ex-Input:");
		input2.setFont(new Font("Arial", Font.PLAIN, 20));
		input2.setSize(100, 20);
		input2.setLocation(310, 110);
		c.add(input2);

		tinput2 = new JTextArea();
		tinput2.setFont(new Font("Arial", Font.PLAIN, 15));

		tinput2.setLineWrap(true);
		tinput2.setSize(200, 40);
		tinput2.setLocation(410, 100);

		tinput2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		c.add(tinput2);
	}

	private void outputCombonent() {
		output = new JLabel("Ouput:");
		output.setFont(new Font("Arial", Font.PLAIN, 20));
		output.setSize(100, 20);
		output.setLocation(30, 210);
		c.add(output);

		toutput = new JTextArea();
		toutput.setFont(new Font("Arial", Font.PLAIN, 15));
		toutput.setSize(500, 40);
		toutput.setLocation(100, 200);

		toutput.setEnabled(false);
		toutput.setLineWrap(true);

		toutput.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		c.add(toutput);
	}

	private void optionButton() {

		JButton reverseBtn = new JButton();
		reverseBtn = new JButton("Reverse");
		reverseBtn.setFont(new Font("Arial", Font.PLAIN, 15));
		reverseBtn.setSize(150, 30);
		reverseBtn.setLocation(20, 280);
		reverseBtn.addActionListener(this);
		c.add(reverseBtn);

		JButton palindBtn = new JButton();
		palindBtn = new JButton("Palindrome");
		palindBtn.setFont(new Font("Arial", Font.PLAIN, 15));
		palindBtn.setSize(150, 30);
		palindBtn.setLocation(175, 280);
		palindBtn.addActionListener(this);
		c.add(palindBtn);

		JButton vowelConsonantCounterBtn = new JButton();
		vowelConsonantCounterBtn = new JButton("Vowel & Consonant");
		vowelConsonantCounterBtn.setFont(new Font("Arial", Font.PLAIN, 15));
		vowelConsonantCounterBtn.setSize(170, 30);
		vowelConsonantCounterBtn.setLocation(330, 280);
		vowelConsonantCounterBtn.addActionListener(this);
		c.add(vowelConsonantCounterBtn);

		JButton largestWord = new JButton();
		largestWord = new JButton("Largest Word");
		largestWord.setFont(new Font("Arial", Font.PLAIN, 15));
		largestWord.setSize(150, 30);
		largestWord.setLocation(505, 280);
		largestWord.addActionListener(this);
		c.add(largestWord);

		JButton anagrams = new JButton();
		anagrams = new JButton("Anagrams");
		anagrams.setFont(new Font("Arial", Font.PLAIN, 15));
		anagrams.setSize(150, 30);
		anagrams.setLocation(20, 320);
		anagrams.addActionListener(this);
		c.add(anagrams);

		JButton removeWhiteSpaces = new JButton();
		removeWhiteSpaces = new JButton("Remove White Spaces");
		removeWhiteSpaces.setFont(new Font("Arial", Font.PLAIN, 15));
		removeWhiteSpaces.setSize(200, 30);
		removeWhiteSpaces.setLocation(175, 320);
		removeWhiteSpaces.addActionListener(this);
		c.add(removeWhiteSpaces);

		JButton secondMostFrequentChar = new JButton();
		secondMostFrequentChar = new JButton("Second Most Frequent");
		secondMostFrequentChar.setFont(new Font("Arial", Font.PLAIN, 15));
		secondMostFrequentChar.setSize(200, 30);
		secondMostFrequentChar.setLocation(380, 320);
		secondMostFrequentChar.addActionListener(this);
		c.add(secondMostFrequentChar);

		JButton removeFirstLastCharacter = new JButton();
		removeFirstLastCharacter = new JButton("Remove First Last");
		removeFirstLastCharacter.setFont(new Font("Arial", Font.PLAIN, 15));
		removeFirstLastCharacter.setSize(170, 30);
		removeFirstLastCharacter.setLocation(20, 360);
		removeFirstLastCharacter.addActionListener(this);
		c.add(removeFirstLastCharacter);

		JButton countWords = new JButton();
		countWords = new JButton("Count Words");
		countWords.setFont(new Font("Arial", Font.PLAIN, 15));
		countWords.setSize(150, 30);
		countWords.setLocation(195, 360);
		countWords.addActionListener(this);
		c.add(countWords);

		JButton containsOnlyDigits = new JButton();
		containsOnlyDigits = new JButton("Contains Only Digits");
		containsOnlyDigits.setFont(new Font("Arial", Font.PLAIN, 15));
		containsOnlyDigits.setSize(200, 30);
		containsOnlyDigits.setLocation(350, 360);
		containsOnlyDigits.addActionListener(this);
		c.add(containsOnlyDigits);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Reverse")) {
			String inputText = tinput1.getText();
			String reversedText = Ex1.reverseString(inputText);
			toutput.setText(" Reverse: " + reversedText);
		}
		if (e.getActionCommand().equals("Palindrome")) {
			String inputText = tinput1.getText();
			boolean isPalindrome = Ex2.isPalindrome(inputText);
			if (isPalindrome) {
				toutput.setText("The string is a palindrome.");
			} else {
				toutput.setText("The string is not a palindrome.");
			}
		}
		if (e.getActionCommand().equals("Vowel & Consonant")) {
			String inputText = tinput1.getText();
			String output = Ex3.countVowelsAndConsonants(inputText);
			toutput.setText(output);
		}
		if (e.getActionCommand().equals("Largest Word")) {
			String inputText = tinput1.getText();
			String output = Ex4.findLargestWord(inputText);
			toutput.setText(output);
		}
		if (e.getActionCommand().equals("Anagrams")) {
			String inputText1 = tinput1.getText();
			String inputText2 = tinput2.getText();
			boolean output = Ex5.areAnagrams(inputText1, inputText2);
			if (output) {
				toutput.setText("Two string are Anagrams.");
			} else {
				toutput.setText("Two string are not Anagrams.");
			}
		}
		if (e.getActionCommand().equals("Remove White Spaces")) {
			String inputText = tinput1.getText();
			String output = Ex6.removeWhiteSpaces(inputText);
			toutput.setText(output);
		}
		if (e.getActionCommand().equals("Second Most Frequent")) {
			String inputText = tinput1.getText();
			String output = Ex7.findSecondMostFrequentChar(inputText);
			toutput.setText(output);
		}

	}

	public static void main(String[] args) throws Exception {
		MainProgram f = new MainProgram();
	}

}